import java.util.regex.Pattern;

import cz.expertkom.ju.task.Nameable;

public abstract class Building implements Nameable  {
	
	private String buildingName;
	private boolean fire; 

	public Building(String buildingName, boolean fire) {
		this.buildingName = buildingName; 
		this.fire = fire; 
	} 

	public String getName() {
		return buildingName + " ";
	}
	
	public void setName(String name) {
		if (name != null && name.contains(" ")) {
			String[] parts = name.split(Pattern.quote(" "));
			if (parts.length > 1) {
				this.buildingName = parts[0];
			}
		}
	}
	
	public boolean detectFire() {
		FireAlarm.checkForFire();
		return fire;
	}
	
	public void isInFire(boolean fire) {
		if(true) {
			FireAlarm.callFireDepartment();
		}else {
			detectFire();
		}
	}
}
