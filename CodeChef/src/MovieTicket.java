import java.util.ArrayList;
import java.util.Scanner;

public class MovieTicket {
    private static class Seat{
        int row;
        int seatNo;
        boolean aisle;
        boolean booked;
        Seat(){
            row=1;
            seatNo=1;
            aisle=false;
            booked=false;
        }
        Seat(int r, int s, boolean a){
            row=r;
            seatNo=s;
            aisle=a;
        }
        public boolean setAisle(){
            aisle=true;return true;
        }
        public boolean setbooked(){
            booked=true;
            return true;
        }
    }
    private static class Screen{
        String name ;
        int row;
        int seats;
        ArrayList<ArrayList<Seat>> seatArrayList= new ArrayList<>();
        Screen(){
            name= "Screen1";
            row=0;
            seats=0;
        }
        Screen(String nam, int ro, int seat, ArrayList<Integer> aisle){
            name = nam;
            row=ro;
            seats=seat;
            for(int i=0;i<row;i++){
                ArrayList<Seat> rowSeat= new ArrayList<>();
                for(int j=0;j<seat;j++){
                    Seat s = new Seat(i,j,false);
                    if(aisle.contains(j))
                        s.aisle= true;
                    rowSeat.add(s);

                }
                seatArrayList.add(rowSeat);
            }
        }
        private String getUnreserved(int r){
            String res= "";
            for(int i=0;i<seats;i++){
                if(!seatArrayList.get(r).get(i).booked)
                    res+=String.valueOf(i+1)+" ";
            }
            return res;
        }
        private boolean reserve(int r, ArrayList<Integer> seat){
            if(seat.size()==0 || r>row)
                return false;
            else
                for(int i=0;i<seat.size();i++){
                    if(seatArrayList.get(r).get(seat.get(i)-1).booked)
                        return false;
                    else
                        seatArrayList.get(r).get(seat.get(i)-1).setbooked();
                }
            return true;
        }
        private String getContigious(int no, int ro,int endN){

            for(int i=0;i<seats;i++){
                String r= String.valueOf(i+1);
                if(r.charAt(0)==endN || r.charAt(r.length()-1)==endN){
                    //check in increase
                    String v="";
                    int count =0;
                    for(int k=0;k<no;k++){
                        if(!seatArrayList.get(ro).get(i+k).booked && !seatArrayList.get(ro).get(i+k).aisle){
                            v+=(i+k)+" ";count++;
                         }else
                             break;
                     }
                    if(count!=no){
                        v="";
                        for(int k=0;k<no;k++){
                            if(!seatArrayList.get(ro).get(i-k).booked && !seatArrayList.get(ro).get(i-k).aisle){
                                v+=(i-k)+" ";count++;
                            }else
                                break;
                        }
                    }
                    if(count!=no)
                        return "none";
                    else
                        return v;
                }
            }
            return "none";
        }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int op = Integer.parseInt(sc.next());
        ArrayList<Screen> list_screen= new ArrayList<>();
        ArrayList<String> screenName= new ArrayList<>();
        ArrayList<String> result= new ArrayList<>();
        sc.nextLine();
        int k=0;
        for(int i=0;i<op;i++){
           String[] val = sc.nextLine().trim().split(" ");
           switch (val[0]){
               case "add-screen":
                   String name = val[1];
                   int row = Integer.parseInt(val[2]);
                   int seat= Integer.parseInt(val[3]);
                   ArrayList<Integer> p = new ArrayList<>();
                    k=3;
                   while(k<val.length){
                       p.add(Integer.parseInt(val[k]));k++;
                   }
                   Screen screen1 = new Screen(name,row,seat,p);
                   list_screen.add(screen1);
                   screenName.add(name);
                   result.add("success");
                   break;
               case "reserve-seat":
                   String nme = val[1];
                   int rw= Integer.parseInt(val[2]);
                   ArrayList<Integer> seats= new ArrayList<>();
                   k=3;
                   while(k<val.length){
                       seats.add(Integer.parseInt(val[k]));k++;
                   }
                   if(screenName.contains(nme)) {
                       int ind = screenName.indexOf(nme);
                       Screen s = list_screen.get(ind);
                       if(s.reserve(rw, seats))
                           result.add("success");
                       else
                           result.add("failure");
                   }else{
                       System.out.println("here one");
                       result.add("failure");
                   }

                   break;
               case "get-unreserved-seats":
                   String nms= val[1];
                   int rowe= Integer.parseInt(val[2]);
                   if(screenName.contains(nms)) {
                       int ind = screenName.indexOf(nms);
                       Screen s = list_screen.get(ind);
                       result.add(s.getUnreserved(rowe));

                   }else{
                       result.add("none");
                   }
                   break;

               case "suggest-contiguous-seats":
                   String nmr= val[1];
                   if(screenName.contains(nmr)){
                       Screen s = list_screen.get(screenName.indexOf(nmr));
                       int number= Integer.parseInt(val[2]);
                       int rws= Integer.parseInt(val[3]);
                       int endNum= Integer.parseInt(val[4]);
                       result.add(s.getContigious(number,rws,endNum));
                   }else
                       result.add("none");

           }

           System.out.println();
        }
        for(int i=0;i<result.size();i++)
            System.out.println(result.get(i));



    }

}
