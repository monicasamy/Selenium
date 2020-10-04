package week3.day1;

public class Smartphoone extends Android {
	
	public void connectWhatsApp()
	{
		System.out.println("connected");
	}
	public void takeVideo(String a)
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		Smartphoone mob = new Smartphoone();
		mob.connectWhatsApp();
		mob.takeVideo("Taken video");
		mob.sendMsg();
		mob.makeCall();
		mob.saveContact();
		
		}

}
