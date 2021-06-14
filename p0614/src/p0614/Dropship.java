package p0614;

public class Dropship extends Unit{

	int x, y;

	void move(int x, int y) {
		System.out.println("좌표 : [" + x + ", " + y + "]/직선으로 이동(길이 없어도 가능),이동속도 80");
	}

	void stop() {
		System.out.println("그 자리에 멈춤");
	}

	void load() {
		System.out.println("사람 8명 또는 탱크 2개 실음");
	}

	void unload() {
		System.out.println("태운 대상을 내림");
	}

}
