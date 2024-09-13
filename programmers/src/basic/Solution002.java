package basic;

public class Solution002 {
    public static int solution(int a, int b) {
        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);
        int num1 = Integer.valueOf(aStr + bStr);
        int num2 = 2*a*b;
        int answer = 0;
        if(num1>num2){
            answer = num1;
        } else{
            answer = num2;
        }
        return answer;
    }
    public static void main(String[] args) {
		System.out.println(solution(2,91));
		System.out.println(solution(91,2));
	}
}
