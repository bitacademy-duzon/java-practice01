package practice01;

//4번 문제
class Prob4 extends TaskFactory{

	
	String str = null;
	
	
	@Override
	public void input() {
		super.input();
		System.out.println("문자열을 입력하시오");
		str = sc.nextLine();
	}


	@Override
	public void solve() {
		
	}
	
	@Override
	public void print() {
		super.print();		
		
		for(int i=0; i<str.length(); ++i) {
			
			for(int j=0; j < i+1 ; ++j) {
				
				System.out.print(str.charAt(j));
				
			}
			
			System.out.println();
			
		}
		
		
	}
	
	
	
}

