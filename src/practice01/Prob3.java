package practice01;

//3번 문제
class Prob3 extends TaskFactory{

	int sum = 0;
	int start = 0;
	boolean numIsOdd = false;

	@Override
	public void input() {
		super.input();
		System.out.println("-----숫자를 입력하세요------");
		input = sc.nextInt();
		validate();
	}

	@Override
	public void solve() {
		
		
		for(int i = start; i < input+1; i=i+2) {
			
			sum += i;
			System.out.print(i+"\t");
			
		}
		
	
	}
	
	
	@Override
	public void print() {
		
		super.print();
		System.out.println("입력한 숫자..." + input);
		System.out.println("합계... " + sum);
	
	}

	private void validate() {
		
		if(input % 2 == 0) {
			
			numIsOdd = false;
			start = 2;
			
		}else{
			
			numIsOdd = true;
			start = 1;
		}
		
	}
	
}