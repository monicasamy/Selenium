package week1.day1;

public class Mobile {
	
long mobNumber = 8072727656L;
String mobColor = "Black";
double mobWeight = 45.50;
boolean isRefurbished = false;
	public void makeCall() {
		System.out.println("Called Monica");
	}
	public void sendMessage() {
		System.out.println("Message sent");
	}
	public void takePhoto() {
		System.out.println("Photo taken");
	}
	
	public static void main(String[] args) {
		
		Mobile myMob = new Mobile();
		myMob.makeCall();
		myMob.sendMessage();
		myMob.takePhoto();
		long Number = myMob.mobNumber;
		String Color= myMob.mobColor;
		double Weight = myMob.mobWeight;
		boolean Status = myMob.isRefurbished;
		System.out.println(Number);
		System.out.println(Color);	
		System.out.println(Weight);
		System.out.println(Status);
	}
}

	
