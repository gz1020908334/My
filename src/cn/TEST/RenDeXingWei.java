package cn.TEST;

public class RenDeXingWei 
{
		String name;
		public void dongZuo(String name)
		{
				System.out.println(name+"没事干");
		}
}
class WuRenKe extends RenDeXingWei
{
		String name="吴仁珂";
		public void dongZuo()
		{
				System.out.println(this.name+"打游戏");
		}
}
