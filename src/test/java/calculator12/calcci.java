package calculator12;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"json:src\\test\\java\\calculator12\\output.json"})
public class calcci {

}
