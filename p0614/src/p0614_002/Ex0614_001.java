package p0614_002;


public class Ex0614_001 {

	public static void main(String[] args) {

		Tank t1 = new Tank();
		Marine m1 = new Marine();
		FireBat f1 = new FireBat();
		DropShip d1 = new DropShip();
		Wraith w1 = new Wraith();
		Scv s1 = new Scv();
		Vulture v1 = new Vulture();
		Medic md = new Medic();

		//[데미지]
		t1.hitPoint = t1.hitPoint - 10;
		f1.hitPoint = f1.hitPoint - 30;
		m1.hitPoint = m1.hitPoint -20;
		d1.hitPoint -= 15;
		
		s1.repair(t1);
		s1.repair(d1);
		s1.repair(v1);
		md.heal(m1);

	}

}
