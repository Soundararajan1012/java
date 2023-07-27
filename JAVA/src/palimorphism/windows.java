package palimorphism;

public class windows {
	public void winName(String name,String name1)
	{
		System.out.println("Windows Name:"+name);
		System.out.println("Windows Name:"+name1);
	}
	public void winName(String name2,String name3,String name4)
	{
		System.out.println("Windows Name:"+name2);
		System.out.println("Windows Name:"+name3);
		System.out.println("Windows Name:"+name4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		windows w1=new windows();
		w1.winName("Linux","Mac");
		w1.winName("Windows7","Windows8","Windows9");

	}

}
