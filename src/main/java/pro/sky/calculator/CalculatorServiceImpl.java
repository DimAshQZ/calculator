package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String toGreet() {
        return "Добро пожаловать в калькулятор.";
    }

    @Override
    public int calcPlus(int num1, int num2) {
        return num1 + num2;
    }


    @Override
    public int calcMinus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int calcMultiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int calcDivide(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

}
