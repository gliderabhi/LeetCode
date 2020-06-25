import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class division {
    public static String fractionToDecimal(int a, int b) {
        long A = a;
        long B= b;
        String rest = "";
        if(A==0){
            return "0";
        }
        if(A<0 ^ B<0)
            rest+="-";

        A=Math.abs(A);
        B= Math.abs(B);
        if(B==1){

            rest+=String.valueOf(A);
            return rest;
        }
        long hand=0;
        if(A>B){
            hand=A/B;
            A=A%B;
        }
        if(A==0){
            return rest+ hand;
        }
        int repeat = 0;
        long res =1;
        ArrayList<Integer> deci = new ArrayList<>();
        HashSet<Integer> ress= new HashSet<>();
        rest+= hand +".";
        while(res!=0 ){

            while(A<B){
                A*=10;
            }
            res=A%B;
            System.out.println(res);
            if(ress.contains((int)res)){
                repeat=1;
                res=0;
            }else {
                ress.add((int) res);
                deci.add((int) (A / B));
                A = res;
            }
        }
        if(repeat==1){
            rest+="(";
            for(int i=0;i<deci.size();i++){
                rest+=String.valueOf(deci.get(i));
            }
            rest+=")";
        }else{
            for(int i=0;i<deci.size();i++){
                rest+=String.valueOf(deci.get(i));
            }
        }
        return rest;
    }
public static String fractionToDecimal2(int A, int B) {
   String s="",t;
HashSet mp = new HashSet();
long flag=0,a,b,k,b_v;

if(A==0)
 return "0";
 
if(A<0 ^ B<0)
 s+="-"; 

a=Math.abs(A);b=Math.abs(B);

if(a%b==0)
 {
      k=a/b;
      t= String.valueOf(k);
     s=s+t;
     return s; 
     
 }
 k=a/b;
 a=a%b;
 t=String.valueOf(k);
 s=s+t;
 s=s+".";
 a*=10;
 while(true)
 {  if(a==0){
      return s;}
    if(a<b)
    {   if(flag==0)//adding 0
         s+="0"; 
         
         a=a*10;

    }
   else
    { if(mp.contains(a))
       {b_v=a/b;
        s+=")";
        break;}
      
      mp.add(a);
      k=a/b;
      s+=String.valueOf(k);
      a=a%b;
      flag=1;
    }
  // cout<<"a="<<a<<" b="<<b<<" s="<<s<<endl; 
 }
//cout<<“s=”<<s<<endl;
t="";int j;
for(j=s.length()-1;j>=0 && s.charAt(j)!='.';j-- )
{ int l=s.charAt(j)-48;
if(l==b_v)
break;
}
for(int i=0;i<j;i++)
{
t+=s.charAt(i);
}
t+="(";
for(int i=j;i<s.length();i++)
t+=s.charAt(i);

return t;
}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println(fractionToDecimal2(a,b));
    }
}

