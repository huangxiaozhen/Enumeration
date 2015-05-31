package me.huangzhen.enumeration;

//如何自定义一个枚举类

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

// 枚举类自定义方法
class Season
{
	//1.将变量定义成private final类型
	private final String seasonName;
	private final String seasonDesc;
	
	//2.属性在构造器中被初始化
	private Season( String seasonName ,String seasonDesc )
	{
		this.seasonName = seasonName; 
		this.seasonDesc = seasonDesc;
	}

	//3. 通过公共的方法来调用
	public String getSeasonName()
	{
		return seasonName;
	}

	public String getSeasonDesc()
	{
		return seasonDesc;
	}

	//4. 创建枚举类的对象  如果只有一个对象，就是单例模式
	public static final Season SPIRNG = new Season("spring", "春天");
	public static final Season SUMMER = new Season("summer", "夏天");
	public static final Season FALL = new Season("fall", "秋天");
	public static final Season WINTER = new Season("winter", "冬天");
	
	@Override
	public String toString()
	{
		return "Season [seasonName=" + seasonName + ", seasonDesc="
				+ seasonDesc + "]";
	}
	
	public void show()
	{
		System.out.println("这是一个季节。");
	}
}
