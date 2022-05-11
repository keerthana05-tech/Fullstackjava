//https://www.beecrowd.com.br/judge/en/problems/view/3309?origem=1&msclkid=bb87c199d14511eca392ed86e52e6922
solution
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
    {
            a[i]=sc.nextInt();
            int m=a[i];
           while(m !=1 && m!=4){  
            m = ishappynum(m);  
        }  
        if(m==1)
        {
            count++;
        }
        
             
            
    }
    System.out.println(count);
    }
    public static int ishappynum(int m)
    {
        int sum=0,r=0;
         while(m>0)
            {
                r=m%10;
                sum=sum+r*r;
                m=m/10;
                
             }
             return sum;
    }

}