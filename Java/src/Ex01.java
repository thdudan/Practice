
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
/*
이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
*/
 


public class Ex01 {
	Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	} 

	@Test
	public void test() {
		assertEquals(Solution.solution(6), 8);
		assertEquals(Solution.solution(16), 4);
		assertEquals(Solution.solution(626331), -1);
	}

	static class Solution {
		public static int solution(long num) {
			int answer = 0;
			while (num != 1) {
				num = (num % 2 == 0) ? num / 2 : num * 3 + 1;
				answer++;
				System.out.println(answer + ":" + num);
				if (answer >= 500) return -1;
			}
			return answer;
		}
	}
}
