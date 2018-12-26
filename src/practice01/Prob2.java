package practice01;

//2번 문제
public class Prob2 extends TaskFactory{


	@Override
	public void solve() {
		
		int i = 0;
		
		for(i = 0; i<10; ++i) {
			
			for(int j=0; j<10; ++j) {
				
				System.out.print((i+j) + "\t");
				
			}
			System.out.println("");
			
			
		}
		
	}
	
}