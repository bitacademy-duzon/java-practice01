package practice01;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int sum = 0;
		
		System.out.print("숫자를 입력하세요: ");
		num = sc.nextInt();
		
		// if num is even
		if (num % 2 == 0) {
			for (int i = 0; i <= num; i += 2) {
				sum += i;
			}
		} else {
			for (int i = 1; i <= num; i += 2) {
				sum += i;
			}
		}
		System.out.print("결과 값 : ");
		System.out.println(sum);
	}
	
}
