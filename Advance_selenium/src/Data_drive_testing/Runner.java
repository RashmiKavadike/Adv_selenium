package Data_drive_testing;

import Generic.Data_driven_testing;

public class Runner {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String val1 = Data_driven_testing.getdata("Sheet1", 0, 0);
		System.out.println(val1);
		Thread.sleep(2000);
		String val2 = Data_driven_testing.getdata("Sheet1", 1, 1);
		System.out.println(val2);
		
	}

}//jjii