package p0614_002;

public class Scv extends GroundUnit implements Repairable,healavle{
	
	Scv() {
		super(40);
		hitPoint = MAX_HP;
	}

	void repair(Repairable r) {
		Unit u = (Unit)r;
		while(u.hitPoint != u.MAX_HP){
			u.hitPoint++;
		}
		if(u.hitPoint == u.MAX_HP) {
			System.out.println(u.hitPoint + " 수리가 완료되었습니다.");
		}
	}
	
}
