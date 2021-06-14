package p0614;

abstract class Unit {
	int x,y;
	
	abstract void move(int x,int y);
	
	void stop() {
		System.out.println("그 자리에 멈춤");
	}
}
