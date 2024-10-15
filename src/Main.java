import classcalculator.Calculator;
import classcalculator.OperationException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double operand1 = 0;
        double operand2 = 0;

        Calculator calculator = new Calculator();

        while (true) {
            try {
                System.out.print("숫자를 입력해 주세요(2개 입력/종료 exit) : ");
                String input = scanner.next();
                if (input.equals("exit")) {
                    break;
                }
                operand1 = Double.parseDouble(input);
                operand2 = scanner.nextDouble();

                System.out.print("연산자를 입력해 주세요(+. -, *, /, %) : ");
                String operator = scanner.next();

                calculator.setCalculate(operand1, operand2, operator);
                double result = calculator.getResult();

                if(Double.isNaN(result) || Double.isInfinite(result)) {
                    throw new ArithmeticException();
                }

                System.out.println("결과 : " + result);
                System.out.print("가장 먼저 저장된 데이터를 삭제 하시겠습니까?(Y/N) : ");
                String answer = scanner.next();
                if(answer.equals("Y")) {
                    calculator.removeResult();
                }

            } catch (NumberFormatException e) {
                // 입력받은 값이 숫자가 아닌 경우 예외 처리
                System.out.println("숫자를 입력해 주세요.");
            } catch (ArithmeticException e) {
                // 나누기 연산 중 분모가 0일 경우 예외 처리
                System.out.println("분모가 0이 될 순 없습니다. 다시 입력해 주세요.");
            } catch (OperationException e){
                // 연산자가 지정된 것 이외에 나올 경우
                System.out.println(e.getMessage());
            }
        }
    }
}