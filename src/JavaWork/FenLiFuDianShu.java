package JavaWork;
import java.util.*;
public class FenLiFuDianShu {
		public static void main(String[] args)
		{
				Scanner S=new Scanner(System.in);
				double a=S.nextDouble();
				int b=(int)a;
				double c=a-b;
				System.out.println("整数部分："+b+"     小数部分："+c);
				S.close();
		}
}
