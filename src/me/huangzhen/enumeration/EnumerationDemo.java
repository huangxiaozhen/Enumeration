package me.huangzhen.enumeration;

//使用 enum 定义枚举类
//常用的方法 Values ValueOf
//可以让不同的枚举类对象执行被重写的方法，相当于每一个对象重写抽象方法

public class EnumerationDemo
{
	public static void main(String[] args)
	{
		Season1 spring = Season1.SPRING;
		System.out.println(spring);

		spring.show();
		System.out.println(spring.getSeasonName());
		System.out.println(spring.getSeasonDesc());

		// enmu 中用到的两个方法
		Season1[] season1s = Season1.values();
		for (Season1 season1 : season1s)
		{
			System.out.println(season1);
		}

		// 2. ValueOF java.lang.IllegalArgumentException:
		Season1 spring1 = Season1.valueOf("SPRING");
		System.out.println(spring1);

		Thread.State[] states = Thread.State.values();
		for (Thread.State state : states)
		{
			System.out.println(state);
		}
		
		Season1 summer = Season1.SUMMER;
		summer.show();
		

	}
}

interface Info
{
	public void show();
}

enum Season1 implements Info
{
	SPRING("spring", "春天"){
		
		public void show()
		{
			System.out.println(" this is a spring season. ");
		}
		
		
		
	}, 
	SUMMER("summer", "夏天"){
		
		public void show()
		{
			System.out.println(" this is a summer season. ");
		}
		
	}, 
	AUTUMN("autumn", "秋天"){
		
		public void show()
		{
			System.out.println(" this is a autumn season. ");
		}
		
	},
	WINTER(
			"winter", "冬天"){
		
		public void show()
		{
			System.out.println(" this is a winter season. ");
		}
		
	};

	// 需要让不同的对象调用show方法时，执行的效果不一样
	

	private final String seasonName;
	private final String seasonDesc;

	private Season1(String seasonName, String seasonDesc)
	{
		this.seasonName = seasonName;
		this.seasonDesc = seasonDesc;
	}

	public String getSeasonName()
	{
		return seasonName;
	}

	public String getSeasonDesc()
	{
		return seasonDesc;
	}

}
