package exam;

public class test {
	public static void main(String[] args) {
		int[] sc = {95,71,84};
		int sum = 0;
		for(int nn:sc) {
			sum = sum+=nn;
		}
		double avg = (double)sum/3;
		System.out.println(avg);
		
	}
}
