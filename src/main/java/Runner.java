public class Runner {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(1, 2);
        WaterBottle waterbottle = new WaterBottle();

        calculator.add();
        calculator.subtract();
        calculator.multiply();
        calculator.divide();

        waterbottle.drink();
        waterbottle.empty();
        waterbottle.fill();
    }
}