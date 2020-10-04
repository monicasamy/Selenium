package week3.day1;

public class Axisbank extends Bankinfo{
	
	public void deposit()
	{
		System.out.println("Axis enabled normal deposit only");
	}

	public static void main(String[] args) {
	
           Axisbank features = new Axisbank();
           features.deposit();
           features.saving();
           features.fixed();
           Bankinfo feat = new Bankinfo();
           feat.deposit();
 
	}

}
