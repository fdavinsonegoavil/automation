package starter;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import starter.steps.MathWizSteps;

@RunWith(SerenityRunner.class)
@Narrative(text = {"La matematica es importante"})
public class ASimpleTest {

    @Steps
    MathWizSteps Bari;

    @Test
    public void suma() {
        // Given
        Bari.tiene(1);

        // When
        Bari.suma(2);

        // Then
        Bari.deberiaTener(3);
    }
}
