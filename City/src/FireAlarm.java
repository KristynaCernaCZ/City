
public class FireAlarm {

	public static void callFireDepartment() {
		System.out.println("Fire department was notified");
	}
	
	public boolean checkForFire(boolean fire) {
		if(fire == false) {
		System.out.println("No problem detected");
		return false;
	    } else {
		System.out.println("Fire was dectected in the building");
		return true; 
		}
	}
}
