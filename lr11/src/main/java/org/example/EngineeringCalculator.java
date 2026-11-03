package org.example;

public class EngineeringCalculator extends Calculator{
    public EngineeringCalculator(String model, String version) {
        super(model, version);
    }

    public int calculate(int a, int b, String operation) {
        switch (operation) {
            case "+": return super.calculate(a, b);
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            case "%": return a % b;
            default: return 0;
        }
    }
    @Override
    public String getDescription() {
        return "Инженерный калькулятор";
    }
}
