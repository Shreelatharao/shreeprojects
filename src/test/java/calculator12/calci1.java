package calculator12;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class calci1 {
	@Given("I enter 50 in the calculator")
	public void calc()
	{
		System.out.println("I have entered the 50 in the calculator");
	}
	@And("I press add")
	public void calc1()
	{
		System.out.println("I have  pressed add in the calculator");
	}
	@And("I enter 30 in the calculator") 
	public void calc2()
	{
		System.out.println("I have entered the 30 in the calculator");
	}
	@When("I press equal symbol")
	public void calc3()
	{
		System.out.println("I have  pressed equal symbol in the calculator");
	}
	@Then("The 80 should be as the result on the screen")
	public void calc4()
	{
		System.out.println("I have recieved 80 as the result in the calculator");
	}
}
