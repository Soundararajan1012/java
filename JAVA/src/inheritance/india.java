package inheritance;

import java.util.Scanner;

public class india {
	public String India(String languages)
	{
		return languages;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		
		System.out.println("India All Languages");
		india i=new india();
		System.out.println("Enter india all Languages: ");
		System.out.println("Language1:");
		String l1=sc.next();
		System.out.println("Language2:");
		String l2=sc.next();
		System.out.println("language3:");
		String l3=sc.next();
		
		Tamilnadu t=new Tamilnadu();
		System.out.println("Enter Tamilnadu Language: ");
		String tamil=sc.next();
		Kerala k=new Kerala();
		System.out.println("Enter Kerala Language:");
		String kerala=sc.next();
		Andhrapradesh a=new Andhrapradesh();
		System.out.println("Enter AndhraPradesh Language:");
		String telugu=sc.next();
		
		System.out.println("Indian Languages:");
		System.out.println("language1:"+i.India(l1));
		System.out.println("language2:"+i.India(l2));
		System.out.println("language3:"+i.India(l3));
		System.out.println("Tamilnadu Language4:"+t.TamilLanguage(tamil));
		System.out.println("Kerala Language5:"+k.kerala(kerala));
		System.out.println("Andhrapradesh Language6:"+a.Andhrapradeshlanguage(telugu));

	}

}
