package p0615;

public class Scv extends GroundUnit implements Repairable {

	Scv() {
		super(50);
	}

	// 현재 체력(hitpoint)을 풀피(MAX_HP)로 만드는 작업
	void repair(Readable r) {
		Unit u = (Unit) r;
		// MAX_HP 까지 증가
		while (u.MAX_HP != u.hitpoint) {
			u.hitpoint++;
		}
	}

}
