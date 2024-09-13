package basic;

public class Solution007 {
    public static int solution(int a, int b, boolean flag) {
        int answer = 0;
        if(flag){
            answer = a+b;
        } else {
            answer = a-b;
        }
        return answer;
    }
    public static void main(String[] args) {
		System.out.println(solution(-4,7,true));
		System.out.println(solution(-4,7,false));
	}
}
