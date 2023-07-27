package rajan;


public class MaxMin {
	public static void findvalue(int[] num)
	{
		int max=num[0];
		int min=num[0];
		for(int i=1;i<num.length;i++)
		{
			if(num[i]>max)
			{
				max=num[i];
			}
			else if(num[i]<min)
			{
				min=num[i];
			}
		}
		System.out.println("Maximum value:"+max);
		System.out.println("Minimum value:"+min);
	}

	public static void main(String[] args) {
		int[] num= {54, 546, 548, 60};
		findvalue(num);

	}

}
