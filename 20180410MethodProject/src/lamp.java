
public class lamp {
	//�ʵ�
	private boolean isOn;
	
	public void turnOn() {
		isOn = true;
	}
	
	public void turnOff() {
		isOn = false;
	}
	
	public String toString() {
	if (isOn){
		return "�����ֽ��ϴ�";
		 }
	else {
		return "�����ֽ��ϴ�";
		 }
	 
	  }
	
	
	
	
//	public String toString() {
//		return "���� ���´� " + (isOn == true ? "����" : "����");
//	}
	

}
