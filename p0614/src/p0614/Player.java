package p0614;

abstract public class Player {
	
	int PlayPoint;
	
	//생성자
	Player(){
		PlayPoint = 0;
	}
	
	abstract void play(int point);	//추상메소드
	abstract void stop();
	
//	abstract void work1();
//	abstract void work2();
	
	void play() {
		play(PlayPoint);
	}

}
