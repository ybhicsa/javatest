package p0614_002;

public class Medic extends GroundUnit implements healavle{

	Medic() {
		super(30);
		hitPoint = MAX_HP;
	}
	
	void heal(healavle h) {
		Unit g = (Unit)h;
		while(g.hitPoint != g.MAX_HP) {
			g.hitPoint++;
		}
		if(g.hitPoint == g.MAX_HP) {
			System.out.println(g.hitPoint + " 치료가 완료되었습니다.");
		}
	}
}
