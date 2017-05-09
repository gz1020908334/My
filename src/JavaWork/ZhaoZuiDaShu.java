package JavaWork;
import java.util.*;
public class ZhaoZuiDaShu {
		public static void main(String[] args)
		{
				Scanner s=new Scanner(System.in);
				int max=-1,n=1;
				for(int i=1;i<=10;i++)
				{
						int a=s.nextInt();
						if(max<a)
						{
							max=a;
							n=1;
						}
						else if(max==a)
						{
								n++;
						}
				}
				s.close();
				System.out.println("最大数为："+max+"该数出现的次数为："+n);
		}
}
