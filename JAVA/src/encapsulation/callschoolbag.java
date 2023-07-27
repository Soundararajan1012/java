package encapsulation;

public class callschoolbag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		schoolbag s=new schoolbag();
		s.setBooks("Story Books");
		s.setPens("Hero pen");
		s.setNotes("Walmate Note");
		System.out.println("School Bag Things");
		System.out.println("Books:"+s.getBooks());
		System.out.println("Pens:"+s.getPens());
		System.out.println("Notes:"+s.getNotes());

	}

}
