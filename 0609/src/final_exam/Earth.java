package final_exam;

public class Earth {
	//상수 선언 
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURDACE_AREA;
	
	static {
		EARTH_SURDACE_AREA = 4*Math.PI * EARTH_RADIUS*EARTH_RADIUS;
	}
}
