package apps.testing.home.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "json:build/cucumber-report/cucumber.json",
                "html:build/cucumber-report/cucumber.html",
                "junit:build/cucumber-report/cucumber.xml"},
        tags = "", features = {"src/test/java/apps/testing/home/features"},
        glue = "apps.testing.home.definitions", monochrome = true)
public class CucumberRunnerTest {//extends AbstractTestNGCucumberTests {
}
