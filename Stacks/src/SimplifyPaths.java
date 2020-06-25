import java.util.Scanner;
import java.util.Stack;

public class SimplifyPaths {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          String path= scanner.nextLine();
          System.out.print(finalPath(path));
            }

    private static String finalPath(String path) {
        Stack<String> pathVal= new Stack<>();
        Stack<String> slash= new Stack<>();
        int i=0;
        String[] s = path.split("/");
        int k=0;
        for(i=0;i<s.length;i++){
            if(s[i].equals("..")){
               while(k<s.length && s[k].equals(".") ) {
                   k++;
               }
               s[i]="";
                    s[k] = "";
                    k++;
                }
            }
        String paths= "";
        for(i=0;i<s.length;i++){
            if(!s[i].equals("") || !s[i].equals(".")){
                paths+="/"+s[i];
            }
        }

      /*  while(i<path.length()){
            if(i<path.length()-1 && path.charAt(i)=='/'){
                while(i<path.length()-1){
                    if(path.charAt(i)!='/' && path.charAt(i+1)!='.'){
                        paths+=Character.toString(path.charAt(i));
                        i++;
                    }else{
                        i++;
                    }
                }
            }
            if(i<(path.length()-2) && path.charAt(i)=='/' && path.charAt(i+1)=='.'){
                if(path.charAt(i+2)=='.' ){

                }

            }
        }*/
      return paths;
    }
}
