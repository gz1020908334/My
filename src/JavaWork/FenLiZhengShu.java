package JavaWork;

public class FenLiZhengShu {
		public static void main(String[] args)
		{
				int n=(int)(Math.random()*1000),sum=0;
				System.out.println("ԭ������Ϊ��"+n);
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
				System.out.println("��λ֮��Ϊ��"+sum);
		}
}
