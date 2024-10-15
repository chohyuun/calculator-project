package calcnotuseclass;

import java.util.Scanner;

// 이후 클래스 calc 사용을 위해 따로 넣음
public class NotUseClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double result = 0;
        double operand1 = 0;
        double operand2 = 0;

        boolean arithmeticCheck = false;

        while (true) {
            try {
                System.out.print("피연산자를 입력해 주세요(숫자 2개/ 종료: exit) : ");
                String input1 = sc.next();
                if (input1.equals("exit")) {
                    break;
                }
                operand1 = Double.parseDouble(input1);
                operand2 = sc.nextDouble();

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
                arithmeticCheck = Double.isInfinite(result) || Double.isNaN(result);
                if(arithmeticCheck) {
                    throw new ArithmeticException();
                }
            } catch (NumberFormatException e) {
                // 입력받은 값이 숫자가 아닌 경우 예외 처리
                System.out.println("숫자를 입력해 주세요.");
            } catch (ArithmeticException e) {
                // 나누기 연산 중 분모가 0일 경우 예외 처리
                System.out.println("분모가 0이 될 순 없습니다. 다시 입력해 주세요.");
            }
            if(!arithmeticCheck) {
                System.out.println("결과 : " + result);
            }
        }
    }
}