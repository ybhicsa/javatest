package p0614_002;

public class Tank extends GroundUnit implements Repairable{

	Tank() {
		super(150);	//탱크 체력 :150
		hitPoint = MAX_HP;	//탱크 생성시 현제 체력 : 150
	}

}
