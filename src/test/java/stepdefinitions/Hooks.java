package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class Hooks {
//    What is hooks class in cucumber?
//    hooks has Before and After annotations.
//    hooks will run Before and After each Scenario
//    What is in your After in the hooks?
//    -In cucumber hooks I use reports and I take screenshot
//    -I designed my hooks. It takes screenshot when a test scenario fails.

    @Before
    public void setUp(){
//        System.out.println("This is hooks before method");
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
////        System.out.println("This is hooks after method");
////        Getting the screenshot: getScreenshotAs method takes the screenshot
        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//       Attaching the screenshot to the scenarios in the default-cucumber-reports.html

        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png", "Screenshot");
        }

    }
}
