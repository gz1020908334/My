package hehe;

public class HaveComputer {
		public static void main(String[] args)
		{
				Computer c=new Computer();
				c.band="ÁªÏë";
				c.cpuSpand=100;
				Student s1=new Student();
				s1.c=c;
				s1.name="¹ùÖÇ";
				s1.age=22;
				System.out.println(s1.name+"have a"+s1.c.cpuSpand+s1.c.band+"computer!");
		}
}
