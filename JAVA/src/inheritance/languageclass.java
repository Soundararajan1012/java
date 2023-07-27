package inheritance;
import java.util.Scanner;
public class languageclass {
	public String Language(String language)
	{
		return language;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		languageclass l=new languageclass();
		System.out.println("All Languages Details");
		System.out.println("Enter Language1:");
		String language1=sc.next();
		System.out.println("Enter Language2:");
		String Language2=sc.next();
		System.out.println("Enter Language3:");
		String Language3=sc.next();
		Tamillanguage t=new Tamillanguage();
		System.out.println("Enter Language4:");
		String tamil=sc.next();
		englishlanguage e=new englishlanguage();
		System.out.println("Enter Language5:");
		String english=sc.next();
		Telugulanguage k=new Telugulanguage();
		System.out.println("Enter Language6:");
		String telugu=sc.next();
		
		System.out.println("\nAll Languages");
		System.out.println("Language1:"+l.Language(language1));
		System.out.println("Language2:"+l.Language(Language2));
		System.out.println("Language3:"+l.Language(Language3));
		System.out.println("Language4:"+t.Tamil(tamil));
		System.out.println("Language5:"+e.English(english));
		System.out.println("Language6:"+k.Telugu(telugu));
		
		

	}

}
