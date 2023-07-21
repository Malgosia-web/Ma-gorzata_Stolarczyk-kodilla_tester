package homework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;


public class DisplaySteps {
    private final Wallet wallet = new Wallet();
    @Given("there is $100 in my wallet")
    public void there_is_$100_in_my_wallet() {
        wallet.deposit(100);
    }
    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
        Assertions.assertEquals( 100, wallet.getBalance(), "Incorrect wallet balance");
    }
    @Then("I should see that the balance is $100")
    public void i_should_see_that_the_balance_is_$100() {
        Assertions.assertEquals("Your balance is: $100", wallet.showBalance());
    }
}
