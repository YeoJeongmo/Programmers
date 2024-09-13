package basic;

public class Solution008 {
    public static String solution(String code) {
        int mode = 0;
        String ret = "";
        String answer = "";
        for(int idx=0; idx<=code.length()-1; idx++) {
	        if(mode == 0) {
        		if(!code.substring(idx, idx+1).equals("1")) {
        			if(idx % 2 ==0) {
        				ret += code.substring(idx, idx+1);
        			}
        		} else {
        			mode = 1;
        		}
        	} else if (mode == 1) {
        		if(!code.substring(idx, idx+1).equals("1")) {
        			if(idx % 2 ==1) {
        				ret += code.substring(idx, idx+1);
        			}
        		} else {
        			mode = 0;
        		}
        	}
        }
        answer = ret;
        return answer;
    }
    public static String solution2(String code) {
        int mode = 0;
        String ret = "";
        String answer = "";
        char[] arrCh = code.toCharArray(); 
        String c = "1";
        for(int idx=0; idx<=code.length()-1; idx++) {
	        if(mode == 0) {
        		if(!arrCh[idx] == c.charAt(0) ) {
        			if(idx % 2 ==0) {
        				ret += code.substring(idx, idx+1);
        			}
        		} else {
        			mode = 1;
        		}
        	} else if (mode == 1) {
        		if(!code.substring(idx, idx+1).equals("1")) {
        			if(idx % 2 ==1) {
        				ret += code.substring(idx, idx+1);
        			}
        		} else {
        			mode = 0;
        		}
        	}
        }
        answer = ret;
        return answer;
    }
    public static void main(String[] args) {
		System.out.println(solution("abc1abc1abcabc1abc1abc"));
	}
}
