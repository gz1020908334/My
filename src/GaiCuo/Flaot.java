package GaiCuo;
import java.io.*;
public class Flaot
{
	public static void main(String args[])
	{
		float a=0,c=0;
		int b=0;
        String s;
		try{ 
			System.out.print("������һ��������:");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			s=br.readLine();
			a=Float.parseFloat(s);
                        b=(int)a;
                   }catch(IOException e){}
                   c=a-b;
         System.out.println("�ø���������������Ϊ:"+b);
	 System.out.println("�ø�������С������Ϊ:"+c);
         }
}
                    
