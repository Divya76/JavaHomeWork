public class Calculator {
//Declaring integer value
    static int firstValue = 20;
    static int SecondValue = 10;

    public static void main(String[] args) {
        Addition();
        Substraction();
        Multiply();
        Division();
    }
// Method to calculate Addition
    public static void Addition() {
        int Thirdvalue = 30;
        System.out.println(firstValue + SecondValue + Thirdvalue);
    }
// Method to calculate Substraction
    public static void Substraction() {
        System.out.println(firstValue - SecondValue);
    }
// Method to calculate Multiply
    public static void Multiply() {
        System.out.println(firstValue * SecondValue);

    }
// Method to calculate Division
    public static void Division() {
        System.out.println(firstValue / SecondValue);
    }
}
