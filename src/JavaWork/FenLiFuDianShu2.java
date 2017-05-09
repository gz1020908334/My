package JavaWork;
import java.util.*;
public class FenLiFuDianShu2 {
		public static void main(String[] args)
		{
				Scanner S=new Scanner(System.in);
				String a=S.nextLine();
				int i=0;
				boolean flag1=false; 
				char b[]=new char[1000];
				System.out.print("整数部分为：");
				for(i=0;i<a.length();i++)
				{
						b[i]=a.charAt(i);
						if(b[i]!='.'&&flag1==false)
						{
							System.out.print(b[i]);
						}
						else if(b[i]=='.')
						{
								flag1=true;
								System.out.print('\n'+"小数部分为：");
						}
						else if(b[i]!='.'&&flag1==true)
						{
							System.out.print(b[i]);
						}
				}
				S.close();
		}
}
