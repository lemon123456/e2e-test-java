package e2e.test.cucumber.step_definitions;

import cucumber.api.java.en.When;

public class SampleSteps {
    @When("^I run a failing step")
    public void I_run_a_failing_step() throws Throwable {
        System.out.println("************");
    }
}
