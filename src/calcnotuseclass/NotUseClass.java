package calcnotuseclass;

import java.util.Scanner;

// 이후 클래스 calc 사용을 위해 따로 넣음
public class NotUseClass {
    public static void main(String[] args) {
        // todo : 나누기 연산 결과 실수형으로 변환
        Scanner sc = new Scanner(System.in);

        int result = 0;
        int operand1 = 0, operand2 = 0;

        // 숫자 입력 후 숫자가 맞는지 확인
        try {
            System.out.print("피연산자를 입력해 주세요(숫자 2개) : ");
            operand1 = sc.nextInt();
            operand2 = sc.nextInt();

            System.out.print("연산자를 입력해 주세요.(+, -, *, /, %) : ");
            String operation = sc.next();

            switch (operation) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    result = operand1 / operand2;
                    break;
                case "%":
                    result = operand1 % operand2;
                    break;
                default:
                    // 틀린 연산자 입력의 경우 예외 처리
                    System.out.println("사용 가능한 연산자를 입력해 주세요.");
                    break;
            }
        } catch (NumberFormatException e) {
            // 입력받은 값이 숫자가 아닌 경우 예외 처리
            System.out.println("숫자를 입력해 주세요.");
        } catch (ArithmeticException e) {
            // 나누기 연산 중 분모가 0일 경우 예외 처리
            System.out.println(e.getMessage());
        }

        System.out.println("결과 : " + result);
    }
}