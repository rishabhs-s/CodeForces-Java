import java.util.*;
public class Prob158A{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt(),  k=sc.nextInt();//total participants,//cutoff score
        int arr[] = new int[n];//array
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            for(int i=0;i<n;i++)
                if (arr[i] > 0 && arr[i] >= arr[k-1])
                    count++;
            System.out.println(count);
            // else
            }
            
        }
    
