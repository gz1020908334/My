package JavaWork;

public class SuShu {
		public static void main(String[] args)
		{
			boolean Prime[]=new boolean[1005];
			for(int i=0;i<=1003;i++)
				Prime[i]=true;
			for(int i=2;i<=100;i++)
			{
					if(!Prime[i])
						continue;
						for(int j=2;i*j<=1000;j++)
						{
								Prime[i*j]=false;
						}
			}
			int n=0;
			for(int i=2;i<=1000;i++)
			{
					if(Prime[i])
					{
						System.out.print(i+"      ");
						n++;
					}
					if(n==8)
					{
						n=0;
						System.out.println();
					}
			}
		}
}
