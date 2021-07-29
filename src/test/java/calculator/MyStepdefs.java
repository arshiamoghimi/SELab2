package calculator;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private Calculator calculator;
    private int value1;
    private int value2;
    private String operator;
    private int result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("Two input values {int} and {int}, and an operation {operation}")
    public void twoInputValuesFirstAndSecondAndAnOperationOpt(int arg0, int arg1, String opt) {
        value1 = arg0;
        value2 = arg1;
        operator = opt;
    }

    @When("I perform the operation")
    public void iPerformTheOperation() {
        switch (operator) {
            case "/" -> result = calculator.divide(value1, value2);
            case "*" -> result = calculator.multiply(value1, value2);
            case "^" -> result = calculator.power(value1, value2);
        }
    }

    @Then("I expect the result {int}")
    public void iExpectTheResultResult(int arg0) {
        Assert.assertEquals(arg0, result);
        System.out.println(result);
    }

    @ParameterType("/|\\*|\\^")
    public String operation(String operation) {
        return operation;
    }
}
