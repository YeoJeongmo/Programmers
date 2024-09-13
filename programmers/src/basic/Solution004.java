package basic;

public class Solution004 {
    public static int solution(int number, int n, int m) {
        int answer = 0;
        if(number % n == 0 && number % m == 0){
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
    public static void main(String[] args) {
		System.out.println(solution(60,2,3));
		System.out.println(solution(55,10,5));
	}
}
