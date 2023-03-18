import java.util.Scanner;

public class 2609 {

    public static void main(String[] args) {

     
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int N = eucd(Math.max(A, B), Math.min(A, B));

        A = A / N;
        B = B / N;

        int M = A * B * N;

        System.out.println(N);
        System.out.println(M);
    }

    /**
     * 유클리드 호제법 구현 메서드
     * @param bn : 큰 숫자
     * @param sn : 작은 숫자
     * @return
     * 큰 숫자를 작은숫자로 나눈 값이 0이면 작은숫자 리턴, 아니면 재귀형태로 자신을 호출
     */
    static int eucd(int bn, int sn) {
        // 큰숫자를 작은숫자로 나눈 나머지를 계산
        int r = bn % sn;
        // 나머지가 0이면 작은숫자가 최대공약수이므로 작은숫자 리턴
        if (r == 0) {
            return sn;
        } else {
            // 나머지가 0 이상이면 재귀형태로 호출
            // 이때 파라미터는 작은숫자와 나머지를 넣어줌
            return eucd(sn, r);
        }
    }

}