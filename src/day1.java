import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 입력받은 문자 출력하기
        System.out.println("***입력받은 문자 출력하기***");
		String str = scan.next();
		System.out.println(str);
         // 정수 a 와 b 출력하기
        System.out.println("***정수 a와 b 출력하기***");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("a = " + a + "\nb = " + b);
        // 문자열 반복해서 출력하기
        System.out.println("***문자열 반복해서 출력하기***");
		String Str = scan.next();
		int n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.print(Str);
		}
        // 대소문자 바꿔서 출력하기
        System.out.println("\n***대소문자 바꿔서 출력하기***");
        String x = scan.next();
        String answer = "";
        for(int i = 0; i < x.length(); i++){
            char tmp = x.charAt(i);
            if('A' <= tmp && 'Z' >= tmp)
                answer += (char)(tmp + 32);
            else if('a' <= tmp && 'z' >= tmp)
                answer += (char)(tmp - 32);
        }
        System.out.print(answer);
        // 특수문자 출력하기
        System.out.println("\n***특수문자 출력하기***");
        System.out.print("!@#$%^&*(\\'\"<>?:;");
    }
}