import java.util.*;
public class Prob146A{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s="";
        int count=0;
        s=sc.nextLine();
		int y=s.length();
        for(int i=0;i<s.length();i++)
        {
            for(int j=1+i;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                count++;
            }
        }
		int z=y-count;
        if(z%2==0)
        System.out.println("CHAT WITH HER!");
        else
        System.out.println("IGNORE HIM!");
    }
}
