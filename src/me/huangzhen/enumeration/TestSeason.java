package me.huangzhen.enumeration;

//����Զ���һ��ö����

public class TestSeason
{
	public static void main(String[] args)
	{
		Season spring = Season.SPIRNG;
		System.out.println(spring);
		
		System.out.println( spring.getSeasonName() );
		
		spring.show();
	}

}

// ö�����Զ��巽��
class Season
{
	//1.�����������private final����
	private final String seasonName;
	private final String seasonDesc;
	
	//2.�����ڹ������б���ʼ��
	private Season( String seasonName ,String seasonDesc )
	{
		this.seasonName = seasonName; 
		this.seasonDesc = seasonDesc;
	}

	//3. ͨ�������ķ���������
	public String getSeasonName()
	{
		return seasonName;
	}

	public String getSeasonDesc()
	{
		return seasonDesc;
	}

	//4. ����ö����Ķ���  ���ֻ��һ�����󣬾��ǵ���ģʽ
	public static final Season SPIRNG = new Season("spring", "����");
	public static final Season SUMMER = new Season("summer", "����");
	public static final Season FALL = new Season("fall", "����");
	public static final Season WINTER = new Season("winter", "����");
	
	@Override
	public String toString()
	{
		return "Season [seasonName=" + seasonName + ", seasonDesc="
				+ seasonDesc + "]";
	}
	
	public void show()
	{
		System.out.println("����һ�����ڡ�");
	}
}
