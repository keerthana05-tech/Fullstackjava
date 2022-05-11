https://www.beecrowd.com.br/judge/en/problems/view/1168?origem=1
solution
import java.io.*;
import java.util.*;
class Main
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int H1,M1,H2,M2;
        int a,b;
        while(sc.hasNext())
        {
            H1=sc.nextInt();
            M1=sc.nextInt();
            H2=sc.nextInt();
            M2=sc.nextInt();
            if(H1==0&&M1==0&&H2==0&&M2==0)
            {
                break;
            }
            if(H1==0)
            {
                a=24*60+M1;
            }
            else
            {
                a=H1*60 +M1;
            }
            if(H2==0) 
            {
                b=24*60 +M2;
            }
            else
            {
                b=H2*60+M2;
            }
            if(b>a)
            {
                System.out.println(b-a);
            }
            else
            {
                System.out.println(24*60-(a-b));
            }
        }
    }
}
