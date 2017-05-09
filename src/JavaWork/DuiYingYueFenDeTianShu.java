package JavaWork;
import java.util.*;
public class DuiYingYueFenDeTianShu {
		public static void main(String[] args)
		{
				Scanner s=new Scanner(System.in);
				int year,month;
				year=s.nextInt();
				month=s.nextInt();
				s.close();
				int runNian[]={31,29,31,30,31,30,31,31,30,31,30,31};
				int pingNian[]={31,28,31,30,31,30,31,31,30,31,30,31};
				if((year%4==0&&year%100!=0)||year%400==0)
				{
						System.out.println("该月的天数为：" +runNian[month-1]);
				}
				else
						System.out.println("该月的天数为："+pingNian[month-1]);
		}
}
