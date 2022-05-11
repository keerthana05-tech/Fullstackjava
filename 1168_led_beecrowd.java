//https://www.beecrowd.com.br/judge/en/problems/view/1168?msclkid=7905f207d14511ec928ec56b6acb6f07
solution
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]= new String[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.next();
        }
        for(int i=0;i<n;i++)
        
        {    int count=0;
            int y=a[i].length();
            for(int j=0;j<y;j++)
            {
                
                char x=a[i].charAt(j);
                switch(x)
                {
                    case '0':
                        count+=6;
                        break;
                    case '1':
                        count+=2;
                        break;
                    case '2':
                        count+=5;
                        break;
                    case '3':
                        count+=5;
                        break;
                    case '4':
                        count+=4;
                        break;
                    case '5':
                        count+=5;
                        break;
                    case '6':
                        count+=6;
                        break;
                    case '7':
                        count+=3;
                        break;
                    case '8':
                        count+=7;
                        break;
                    case '9':
                        count+=6;
                        break;
                    default:
                        break;
                    
                        
                }
                
            }
            System.out.println(count+" leds");
        }
        
    }
}