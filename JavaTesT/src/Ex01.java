import org.junit.Before;
import org.junit.Test;

public class Ex01 {
	Solution solution;
	
	@Before
	public void before() {
		solution = new Solution();
	}
	
	@Test
	public void test() {
		equals(solution.solution(3));
		equals(solution.solution(4));
	}
	
	static class Solution {
    public String solution(int num) {
	        if(num % 2 == 0) {
	        	return ("Even");
	        } else {
	        	return ("Odd");
	        }
    }
}
}
