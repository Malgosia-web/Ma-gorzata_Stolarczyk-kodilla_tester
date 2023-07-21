package numberchecker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static numberchecker.NumberChecker.checkDivisibility;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzOrBuzzSteps {
    private int number;
    private String answer;

    @Given("My number is 3")
    public void my_number_is_3 () {
        this.number = 3;
    }
    @Given("My number is 6")
    public void my_number_is_6 () {
        this.number = 6;
    }
    @Given("My number is 5")
    public void my_number_is_5 () {
        this.number = 5;
    }
    @Given("My number is 10")
    public void my_number_is_10 () {
        this.number = 10;
    }
    @Given("My number is 15")
    public void my_number_is_15 () {
        this.number = 15;
    }
    @Given("My number is 30")
    public void my_number_is_30 () {
        this.number = 30;
    }
    @Given("My number is 4")
    public void my_number_is_4 () {
        this.number = 4;
    }
    @Given("My number is 8")
    public void my_number_is_8 () {
        this.number = 8;
    }
    @When("I check the number")
    public void i_check_the_number() {
        this.answer = checkDivisibility(this.number);
    }
    @Then("It should be {string}")
    public void it_should_be(String string) {
        assertEquals(string, this.answer);
    }
}

