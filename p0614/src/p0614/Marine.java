package p0614;

public class Marine extends Unit{

	void move(int x, int y) {
		System.out.println("좌표 : [" + x +", "+ y + "]/길을 확인 후 이동(마린은 길이 있어야 이동할 수 있다.),이동속도 20");
	}

	void stimPack() {
		System.out.println("스팀팩 주사를 치료");
	}
}
