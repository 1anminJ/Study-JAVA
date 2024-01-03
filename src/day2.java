import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 덧셈식 출력하기
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int sum = a + b;
//		System.out.println(a + " + " + b + " = " + sum);
        // 문자열 붙여서 출력하기
        String str1 = scan.next();
        String str2 = scan.next();
        System.out.println(str1 + str2);
        // 문자열 돌리기(문자열을 90도로 돌려서 출력
        String str3 = scan.next();
        int x = str3.length();
        for(int i = 0; i < x; i++) {
            System.out.println(str3.charAt(i));
        }
        //
    }
}
