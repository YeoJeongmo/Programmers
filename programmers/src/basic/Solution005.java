package basic;

public class Solution005 {
    public static int solution(int n) {
        int answer = 0;
        if(n % 2 == 1){
            while(n>0){
                answer += n;
                n -= 2;
            }
        } else {
            while(n>0){
                answer += n*n;
                n -= 2;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
		System.out.println(solution(7));
		System.out.println(solution(10));
	}
}
