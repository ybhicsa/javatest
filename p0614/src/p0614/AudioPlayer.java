package p0614;

public class AudioPlayer extends Player {

	@Override
	void play(int point) {
		System.out.println("음성코덱 읽어오기 -> 음성코덱 해독 -> 음성파일 우퍼전달 -> 오디오 좌우 스피커 출력");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}


//	@Override
//	void work1() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	void work2() {
//		// TODO Auto-generated method stub
//		
//	}

}
