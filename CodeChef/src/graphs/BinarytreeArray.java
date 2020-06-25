package graphs;

import java.util.ArrayList;

public class BinarytreeArray {

    public static void main(String[] args)
    {
        Array_imp obj = new Array_imp();
        obj.Root("A");
         obj.set_Left("B", 0);
        obj.set_Right("C", 0);
        obj.set_Left("D", 1);
        obj.set_Right("E", 1);
        obj.set_Left("F", 2);
        obj.print_Tree();
    }

    private static class Array_imp {
        static  int root =0;
        static String[ ] str = new String[10];
        public void Root(String key){
            str[0]= key;
        }
        private void set_Left(String key, int v) {
            str[2 * v + 1] = key;
        }
        private void set_Right(String key, int v) {
            str[2 * v + 2] = key;
        }

        private void print_Tree(){
            for(int i=0;i<10;i++)
                System.out.print(str[i]+ " ");
        }
    }

}
