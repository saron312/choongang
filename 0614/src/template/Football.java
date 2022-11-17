package template;

public class Football extends Game {

	@Override
	void init() {
		System.out.println("축구 초기화");
	}

	@Override
	void start() {
		System.out.println("축구 시작");
	}

	@Override
	void end() {
		System.out.println("축구 끝");
	}

}
