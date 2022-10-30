package starter.math;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import starter.steps.MathWizSteps;

@RunWith(SerenityRunner.class)
@Narrative(text={"La matematica es importante."})
public class WhenAddingNumbers {

    @Steps
    MathWizSteps miguel;

    @Test
    public void suma() {
        // Given
        miguel.tiene(1);

        // When
        miguel.suma(2);

        // Then
        miguel.deberiaTener(3);
    }
}