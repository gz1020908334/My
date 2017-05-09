package JavaWork;
import java.io.*;
public class QiuHe2 {
		public static void main(String[] args)
		{
				int n = 0,sum=0;
				String s="";
				try
				{
					BufferedReader  in=new BufferedReader(new InputStreamReader(System.in));
					s=in.readLine();
					n=Integer.valueOf(s);
				}catch( IOException e){ }
				System.out.println("N="+n);
				while(n!=0)
				{
					sum+=n;
					try
					{
						BufferedReader  in=new BufferedReader(new InputStreamReader(System.in));
						s=in.readLine();
						n=Integer.valueOf(s);
					}catch( IOException e){ }
					System.out.println("N="+n);
				}
				System.out.println("ºÍÎª£º"+sum);
		}
}
