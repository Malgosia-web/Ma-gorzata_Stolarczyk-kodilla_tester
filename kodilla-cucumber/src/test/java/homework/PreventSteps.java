package homework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class PreventSteps {
    private final Wallet wallet = new Wallet();

    @Given("I have $100 in my wallet")
    public void i_have_$100_in_my_wallet() {
        wallet.deposit(100);
    }
    @When("I withdraw $200")
    public void i_withdraw_$200() {
        wallet.debit(200);
    }
    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        Assertions.assertEquals( 100, wallet.getBalance());
    }
    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_i_don_t_have_enough_money_in_my_wallet() {
        Assertions.assertEquals( "You don't have enough money in Your wallet", wallet.debit(200));
    }
}
