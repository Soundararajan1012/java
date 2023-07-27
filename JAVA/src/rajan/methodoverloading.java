package rajan;

public class methodoverloading {
	public void employee(String name)
	{
		System.out.println("Employee name:"+name);
	}
	public void employee(int id,String a)
	{
		System.out.println("Employee id:"+id);
		System.out.println("Employee name:"+a);
	}
	public void employee(String names,long id,long phone)
	{
		System.out.println("Employee names:"+names);
		System.out.println("Employee id:"+id);
		System.out.println("Employee phone:"+phone);
	}
	public void employee()
	{
		System.out.println("Employee details collected");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverloading d=new methodoverloading();
		d.employee();
		d.employee("sk");
		d.employee(101,"sakthi");
		d.employee("arun",1101,900989000);

	}

}
