package constructor;
//default+parameterized constructor are called as constructor overloading
public class constructoroverloading {
	//default overloading
	constructoroverloading()
	{
		System.out.println("Lion");
	}
	//parameterized constructor
	constructoroverloading(String name)
	{
		System.out.println(name);
	}
	constructoroverloading(String one,String two)
	{
		System.out.println(one);
		System.out.println(two);
	}

	public static void main(String[] args) {
		constructoroverloading a=new constructoroverloading();
		constructoroverloading b=new constructoroverloading("cat");
		constructoroverloading c=new constructoroverloading("dog","cow");
		

	}

}
