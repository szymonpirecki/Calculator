public class Main {

    public static void main(String[] args) {
        Calculator<Integer> integerCalculator = new Calculator<>();
        Operation<Integer> minus = new Operation<Integer>() {
            @Override
            public Integer execute(Integer a, Integer b) {
                return a - b;
            }
        };
        Operation<Integer> plus = new Operation<Integer>() {
            @Override
            public Integer execute(Integer a, Integer b) {
                return a + b;
            }
        };

        System.out.println(integerCalculator.performOperation(2, 1, minus));
        System.out.println(integerCalculator.performOperation(2, 1, plus));

        Calculator<Double> doubleCalculator = new Calculator<>();
        Operation<Double> razy = (a, b) -> a * b;
        Operation<Double> dzielenie = (a, b) -> a / b;

        System.out.println(doubleCalculator.performOperation(2.0, 1.0, razy));
        System.out.println(doubleCalculator.performOperation(2.0, 1.0, dzielenie));
    }
}
