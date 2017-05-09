package JavaWork;

public class FenLiZhengShu {
		public static void main(String[] args)
		{
				int n=(int)(Math.random()*1000),sum=0;
				System.out.println("原来的数为："+n);
				int a;
				a=n%10;
				sum+=a;
				n/=10;
				while(n!=0)
				{
						a=n%10;
						sum+=a;
						n/=10;
				}
				System.out.println("数位之和为："+sum);
		}
}
