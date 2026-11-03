package org.example;

public class ScientificCalculator extends Calculator {
    public ScientificCalculator(String model, String version) {
        super(model, version);
    }

    public double calculate(String operation, double a, double b) {
        switch (operation) {
            case "+": return super.calculate(a, b);
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            default: return 0;
        }
    }
    @Override
    public String getDescription() {
        return "Научный калькулятор";
    }
}
