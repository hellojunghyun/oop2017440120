
public class lamp {
	//필드
	private boolean isOn;
	
	public void turnOn() {
		isOn = true;
	}
	
	public void turnOff() {
		isOn = false;
	}
	
	public String toString() {
	if (isOn){
		return "켜져있습니다";
		 }
	else {
		return "꺼져있습니다";
		 }
	 
	  }
	
	
	
	
//	public String toString() {
//		return "현재 상태는 " + (isOn == true ? "켜짐" : "꺼짐");
//	}
	

}
