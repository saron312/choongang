package pg415;

public class Anonymous {
	private int field;

	public void method(final int arg1, int arg2) {
		final int var1 =0;
		int var2 = 0;
		field = 10;
		
		//arg1 = 20; //fianl로 지정했기 때문에 안됨
//		 arg2 = 20;
//		 arg2 = 30;
		
//		var1 = 20;
//		var2 = 30;
		
		Calcul Calc = new Calcul(){

			@Override
			public int sum() {
				int result = field + arg1 + arg2 +var1 + var2;
				return result;
			}
			
		};
		
		System.out.println(Calc.sum());
	}
}
