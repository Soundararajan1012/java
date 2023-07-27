package conditionalsatatementswitch;

public class foodorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int food=5;
		switch(food)
		{
		case 1:
			System.out.println("Dosai Rate was Rs.25");
			System.out.println("your order successfully");
			break;
		case 2:
			System.out.println("Itly Rate was Rs.20");
			System.out.println("your order successfully");
			break;
		case 3:
			System.out.println("Poori Rate was Rs.50");
			System.out.println("your order successfully");
			break;
		case 4:
			System.out.println("Pongal Rate was Rs.70");
			System.out.println("your order successfully");
			break;
		default:
			System.out.println("Invalid Case");
			break;
		}

	}

}
