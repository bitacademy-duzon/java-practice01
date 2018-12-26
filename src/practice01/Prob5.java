package practice01;

public class Prob5 {

	public static void main(String[] args) {
		String clapNum = null;
		int clapCount = 0;
		int tenDigit;
		int unitsDigit;
		
		// if number is the units of digit
		for (int i = 1; i < 10; i++) {
			clapNum = i + "";
			tenDigit = clapNum.charAt(0);
			
			if (tenDigit == '3' || tenDigit == '6' || tenDigit == '9') {
				System.out.println(tenDigit - 48 + " 짝");
			}
		}
		
		// if number is the ten of digit
		for (int i = 10; i < 100; i++) {
			clapNum = i + "";
			clapCount = 0;
			
			tenDigit = clapNum.charAt(0);
			unitsDigit = clapNum.charAt(1);
			
			if (unitsDigit == '3' || unitsDigit == '6' || unitsDigit == '9') {
				clapCount++;
			}
			
			if (tenDigit == '3' || tenDigit == '6' || tenDigit == '9') {
				clapCount++;
			}

			if (clapCount == 1) { System.out.println(clapNum + " 짝"); }
			if (clapCount == 2) { System.out.println(clapNum + " 짝짝"); }
		}
	}
	
}
