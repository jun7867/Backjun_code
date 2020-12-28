import java.util.*;

class Solution {
	public String[] solution(String[] strings, int n) {
		Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return s1.charAt(n) - s2.charAt(n) != 0 
                    ? s1.charAt(n) - s2.charAt(n) 
                    : s1.compareTo(s2); // 두 문자중 사전순으로 빠른거.
			}
			
		});
        return strings;
	}
}
