package p0614;

public class Tank extends Unit {

	void move(int x, int y) {
		System.out.println("좌표 : [" + x + ", " + y + "]/길을 확인 후 이동(탱크는 길이 있어야 이동할 수 있다.),이동속도 50");
	}

	void changeMode() {
		System.out.println("모드를 변경함");
	}

}
