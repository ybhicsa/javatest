package pack01;

class Tv {

	boolean power; //트루,펄스
	int channel;
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
}
