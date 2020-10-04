package week3.day2;

public class Desktop implements Software,Hardware {
	
	public void desktopModel()
	{
		
	}
	public void hardwareResources() {
		
		System.out.println("CPU,Monitor,Mouse,Keyboard");
	}
	public void softwareResources() {
	
		System.out.println("Windows10,Mcaffee,Chrome");
	}


	public static void main(String[] args) {

            Desktop access = new Desktop();
            access.desktopModel();
            access.hardwareResources();
            access.softwareResources();
	}


	

}
