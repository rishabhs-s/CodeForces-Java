import java.util.*;
public class Prob282A{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int count=0;
		int x=sc.nextInt();
		sc.nextLine(); 
        for(int i=0;i<x;i++){
            s=sc.nextLine();
            if(s.equals("x++")||s.equals("++x")||s.equals("++X")||s.equals("X++"))
            {
            count++;
            }
            else
            {
            count--;
            }
            
        }
        System.out.println(count);
    }
}
