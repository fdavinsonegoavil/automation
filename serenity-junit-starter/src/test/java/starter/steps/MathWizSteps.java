package starter.steps;

import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class MathWizSteps {

    String actor;

    Calculator calculator;

    @Step("#actor tiene {0}")
    public void tiene(int amount) {
        calculator = new Calculator(amount);
    }

    @Step("#actor suma  {0}")
    public void suma(int amount) {
        calculator.add(amount);
    }

    @Step("#actor deberia tener {0}")
    public void deberiaTener(int expectedTotal) {
        assertThat(calculator.getTotal()).isEqualTo(expectedTotal);
    }
}
