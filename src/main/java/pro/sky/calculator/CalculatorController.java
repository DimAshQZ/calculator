package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String toGreet() {
        return calculatorService.toGreet();
    }

    @GetMapping(path = "/plus")
    public String calcPlus(@RequestParam("num1") int n1, @RequestParam("num2") int n2) {
        return n1 + " + " + n2 + " = " + calculatorService.calcPlus(n1, n2);
    }

    @GetMapping(path = "/minus")
    public String calcMinus(@RequestParam("num1") int n1, @RequestParam("num2") int n2) {
        return n1 + " - " + n2 + " = " + calculatorService.calcMinus(n1, n2);
    }

    @GetMapping(path = "/multiply")
    public String calcMultiply(@RequestParam("num1") int n1, @RequestParam("num2") int n2) {
        return n1 + " * " + n2 + " = " + calculatorService.calcMultiply(n1, n2);
    }

    @GetMapping(path = "/divide")
    public String calcDivide(@RequestParam("num1") int n1, @RequestParam("num2") int n2) {
        if (calculatorService.calcDivide(n1, n2) == 0) {
            return "Не корректные данные попробуйте снова!";
        } else {
            return n1 + " / " + n2 + " = " + calculatorService.calcDivide(n1, n2);
        }
    }
}
