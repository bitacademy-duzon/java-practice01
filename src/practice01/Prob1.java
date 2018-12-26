package practice01;

public class Prob1 extends TaskFactory{
	
	
	@Override
	public void input() {
		
		System.out.println("숫자를 입력하세요..");
		input = sc.nextInt();
		
	}

	@Override
	public void solve() {
		
		if(input % 3 == 0) {
			
			System.out.println("입력받은 숫자는 3의 배수 입니다.");
			return;
			
		}else {
			
			System.out.println("입력받은 숫자는 3의 배수가 아닙니다.");
			return;
		}
		
	}
	
	
	
	
}