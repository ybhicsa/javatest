package p0517;

public class Tv {

	String color;
	boolean power; // in/off-0/1 두가지만 있다.
	int channel; // 3-tvn 5-sbs 7-kbs 9-kbs1 11-mbc

	void power() {
		power = !power; // true,false
	}

	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;
	}

	int a= 0;
}
