package practice01;

import java.util.HashSet;

//5번 문제
public class Prob5 extends TaskFactory{

	private final HashSet<Integer> stand = new HashSet<>();
	private final int MAX = 100;
	private String numStr = null;

	@Override
	public void input() {
		super.input();
		stand.add(3);
		stand.add(6);
		stand.add(9);

		
	}
	
	@Override
	public void solve() {
		
		for(int i=1; i<MAX+1; ++i) {
			
			int count = 0;
			numStr = String.valueOf(i);
			

			for(int j=0; j<numStr.length(); ++j) {

				if(stand.contains(new Integer(numStr.substring(j, j+1)))){
				
					count++;
					
				}
				
			}
			
			if(count == 0) {
				continue;
			}
			
			this.print(i, count);
			
		}
		
		
	}


	public void print(int n, int clap) {
		
		
		System.out.print("현재 번호..." + n + " 박수 : ");
		for(int i=0; i<clap; ++i) {
			
			System.out.print(" 짝 ");
			
		}
		System.out.println();
		
	}

	
}