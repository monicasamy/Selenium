package week3.day2;

public class College extends University {

	
	public void ug()
	{
		System.out.println("UG completed");
	}
	

	public static void main(String[] args) {
		
		College course = new College();
		course.ug();
		course.pg();

	}

	

}
