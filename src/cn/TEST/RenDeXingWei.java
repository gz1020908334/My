package cn.TEST;

public class RenDeXingWei 
{
		String name;
		public void dongZuo(String name)
		{
				System.out.println(name+"û�¸�");
		}
}
class WuRenKe extends RenDeXingWei
{
		String name="������";
		public void dongZuo()
		{
				System.out.println(this.name+"����Ϸ");
		}
}
