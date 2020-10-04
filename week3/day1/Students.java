package week3.day1;

public class Students {
	
	public void getStudentInfo(int id)
	{
	   System.out.println(id);
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println(id +"-"+  name);
	}
	public void getStudentInfo(String email ,long number)
	{
		System.out.println(email+"-"+ number);
	}

	public static void main(String[] args) {
		
          Students details = new Students();
          details.getStudentInfo(14);
          details.getStudentInfo(14, "Monica");
          details.getStudentInfo("moni@gmail.com",9659170775L);
	}

}
