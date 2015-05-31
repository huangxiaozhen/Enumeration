package me.huangzhen.enumeration;

//ʹ�� enum ����ö����
//���õķ��� Values ValueOf
//�����ò�ͬ��ö�������ִ�б���д�ķ������൱��ÿһ��������д���󷽷�

public class EnumerationDemo
{
	public static void main(String[] args)
	{
		Season1 spring = Season1.SPRING;
		System.out.println(spring);

		spring.show();
		System.out.println(spring.getSeasonName());
		System.out.println(spring.getSeasonDesc());

		// enmu ���õ�����������
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
	SPRING("spring", "����"){
		
		public void show()
		{
			System.out.println(" this is a spring season. ");
		}
		
		
		
	}, 
	SUMMER("summer", "����"){
		
		public void show()
		{
			System.out.println(" this is a summer season. ");
		}
		
	}, 
	AUTUMN("autumn", "����"){
		
		public void show()
		{
			System.out.println(" this is a autumn season. ");
		}
		
	},
	WINTER(
			"winter", "����"){
		
		public void show()
		{
			System.out.println(" this is a winter season. ");
		}
		
	};

	// ��Ҫ�ò�ͬ�Ķ������show����ʱ��ִ�е�Ч����һ��
	

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
