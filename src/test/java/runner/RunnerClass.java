package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\sadia\\eclipse-workspace\\InternshipProjectBDD\\src\\test\\java\\features\\Courses.feature",
                     glue = "step_defination",   
                     monochrome = true,
                     plugin = {"pretty","html:target/cucumberReport.html"},
                     stepNotifications = true, 
                     dryRun = false
//                   ,  tags = "@Release2.0"
                      )


public class RunnerClass {

}
