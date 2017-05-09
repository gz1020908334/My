package JavaWork;
import java.util.*;
public class YuanDeMianJi {
		public static void main(String[] args)
		{
				final double pai=3.14;
				Scanner S=new Scanner(System.in);
				double r=0;
				r=S.nextInt();
				S.close();
				System.out.println("圆的面积为："+pai*r*r);
		}
}
