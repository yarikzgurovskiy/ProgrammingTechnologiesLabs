import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.UsingSteps;
import org.jbehave.core.annotations.When;

import static org.junit.Assert.assertEquals;

public class Stepper {

    private Evaluator evaluator;
    private String result;

    @Given("evaluator")
    public void evaluator() {
        evaluator = new Evaluator();
    }

    @When("evaluate $input")
    public void evaluate(String input) {
        result = evaluator.eval(input);
    }

    @Then("should equal $expected")
    public void shouldEqual(String expected) {
        if(expected.equals("null")) expected = null;
        assertEquals(expected, result);
    }
}