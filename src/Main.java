    import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число А");
            int A = scanner.nextInt();
            System.out.println("Введите операцию");
            String operator = scanner.next();
            System.out.println("Введите число B");
            int B = scanner.nextInt();
            System.out.println(calculate(A, operator, B));
        }
        public static int calculate(int A, String operator, int B) {
            System.out.println("Резyльтат=");
            switch (operator) {
                case "+":
                    return A + B;
                case "-":
                    return A - B;
                case "*":
                    return A * B;
                case "/":
                    return A / B;
            }
            return A + B;
        }
    }
