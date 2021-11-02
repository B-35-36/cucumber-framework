package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        features = "./src/test/resources/features",//MUST
        glue = "stepdefinitions",//MUST
        tags = "@login_test",//OPTIONAL. WITHOUT TAGS, RUNNER RUNS ALL FEATURES
        dryRun = false//OPTIONAL.
        // WITHOUT dryRun(dryRun=false is default,
        // we can not check completion error without seeing the browser
)
public class Runner {
}
/*
* -Runner is used to run feature files
* -@RunWith is used to run the class. Without this, Runner class will not be runnable
* -@CucumberOptions is used to add feature path, step definition path,tags, dryRun, report plug ins
* -features   :  path of the features folder. this can point path of specific feature file
* -glue       :  path of step definitions folder. this can pint path of specific step definition class
* -tags       :  this marks which feature file to run. we add this tag in the feature files
* -dryRun     : -dryRun is used to check if there is any MISSING JAVA CODE(STEP DEFINITIONS)
*               -dryRun takes 2 values, true or false
*               -dryRun = false :Runs tests on the browser while checking if there is any JAVA code missing
*               -dryRun = true  :Runs tests without browser while checking if there is any JAVA code missing
* */