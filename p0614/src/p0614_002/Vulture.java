package p0614_002;

public class Vulture extends GroundUnit implements Repairable{

	Vulture() {
		super(100);	//탱크 체력 :150
		hitPoint = MAX_HP;	//탱크 생성시 현제 체력 : 150
	}

}
