package JavaWork;
import java.util.*;
public class QiuHe1 {
		public static void main(String[] args)
		{
				int n,sum=0;
				Scanner s=new Scanner(System.in);
				n=s.nextInt();
				if(n==0)
				{
						System.out.println("和为："+sum);
						s.close();
						return ;
				}
				do
				{
						sum+=n;
						n=s.nextInt();
				}while(n!=0);
				s.close();
				System.out.println("和为："+sum);
		}
}
