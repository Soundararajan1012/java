package collections;

public class ascendanddescend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,50,40,30,80,90,100};
		System.out.println("Elements of array:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Ascending order:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}
		System.out.println("Descending order:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}

	}

}
