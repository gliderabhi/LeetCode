import java.util.*;

public class maxSubArray {
    private static ArrayList<Integer> getLargest(ArrayList<Integer> p){
        int iter = p.size();
        int sum =0;
        int largest = Integer.MIN_VALUE;
        int siz=0;
        int firstIndex =0;
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> largestArray = new ArrayList<>();
        //int [] largestArray = new int[iter];
        for(int i=0;i<iter;i++){
               arr.add(p.get(i));

            for ( siz =0; siz < arr.size();siz++){
                sum= 0;
                for (int j=0 ; (j+siz)< arr.size(); j++){
                    sum += arr.get(j+siz);
                }
                if(sum == largest){
                    if(largestArray.size() < (siz)){
                        largestArray.clear();
                        for (int j=0 ; (j+siz)< arr.size(); j++){
                            largestArray.add(arr.get(j+siz));
                        }
                    }else if( largestArray.size() == siz){
                        if(firstIndex > siz){
                            largestArray.clear();
                            for (int j=0 ; (j+siz)< arr.size(); j++){
                                largestArray.add( arr.get(j+siz));
                            }
                        }
                    }
                }
                if(sum > largest){
                    largestArray.clear();
                    for (int j=0 ; (j+siz)< arr.size(); j++){
                        largestArray.add(arr.get(j+siz));
                        firstIndex = siz;
                    }
                    largest= sum;
                }

            }

        }
        return largestArray;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int iter = scan.nextInt();
        int sum =0;
        int largest = Integer.MIN_VALUE;
        int siz=0;
        int firstIndex =0;
        int count=0;
        int [] largestArray = new int[iter];
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<iter;i++){
            arr.add(scan.nextInt());
        }
        scan.close();
        ArrayList<Integer> reslt = getLargest(arr);
        for(int i=0; i< reslt.size(); i++){
            System.out.print(reslt.get(i) + " ");
        }
    }
}

            /*for ( siz =0; siz < arr.size();siz++){
                sum= 0;
                for (int j=0 ; (j+siz)< arr.size(); j++){
                    sum += arr.get(j+siz);
                }
                if(sum == largest){
                    if(largestArray.length < (siz)){
                        count =0;
                        for (int j=0 ; (j+siz)< arr.size(); j++){
                            largestArray[j] = arr.get(j+siz); count++;
                        }
                    }else if( largestArray.length == siz){
                        if(firstIndex > siz){
                            count =0;
                            for (int j=0 ; (j+siz)< arr.size(); j++){
                                largestArray[j] = arr.get(j+siz);
                                count++;
                            }
                        }
                    }
                }
                if(sum > largest){
                    count =0;
                    for (int j=0 ; (j+siz)< arr.size(); j++){
                         largestArray[j] = arr.get(j+siz);
                         firstIndex = siz;
                         count++;
                    }
                    largest= sum;
                }

            }*/