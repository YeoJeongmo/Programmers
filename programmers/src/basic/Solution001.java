package basic;

public class Solution001 {
    public static int solution(int a, int b) {
        String aStr = Integer.toString(a); // 숫자열을 문자열로 변환
        String bStr = Integer.toString(b);
        int num1 = Integer.valueOf(aStr+bStr); // 문자열을 숫자열로 변환
        int num2 = Integer.valueOf(bStr+aStr);
        int answer = 0;
        if(num1>num2){
            answer = num1;
        } else {
            answer = num2;
        }
        return answer;
    }
    public static void main(String[] args) {
		System.out.println(solution(9,91));
		System.out.println(solution(89,8));
	}
}
