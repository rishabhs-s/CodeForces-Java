import java.util.*;
public class Weight{
    public static void main(String[] args){
        double w;
        Scanner sc=new Scanner(System.in);
        w=sc.nextDouble();
        if(w>2)
        {
        if(w%2==0)
        System.out.println("YES");
        else
             System.out.println("NO");
        }
        else
             System.out.println("NO");
    }
}
