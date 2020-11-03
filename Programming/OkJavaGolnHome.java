import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;;

public class OkJavaGolnHome {

	public static void main(String[] args) {
		
		String id = "JAVA APT 507";
		// Elevator call
		// org.opentutorials.iot.Elevator : �̸� ����� ���� ���̺귯���� ����Ѵ�.
		Elevator myElevator = new Elevator(id);
		// myElevator ������ �ݵ�� Elevator ������ Ÿ�Կ� �ش��ϴ� �����͸� �� �� �ִ�.
		myElevator.callForUp(1); // 1������ ���������� ����
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id + " / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id + " / floor Lamp");
		floorLamp.on();
		
		

	}

}