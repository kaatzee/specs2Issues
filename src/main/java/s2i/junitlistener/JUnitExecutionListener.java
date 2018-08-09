package s2i.junitlistener;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class JUnitExecutionListener extends RunListener {

    public void testRunStarted(Description description) throws Exception {
        System.out.println("Number of tests to execute: " + description.testCount());
    }

    public void testRunFinished(Result result) throws Exception {
        System.out.println("Number of tests executed: " + result.getRunCount());
    }

    public void testStarted(Description description) throws Exception {
        print("Starting", description);
    }

    public void testFinished(Description description) throws Exception {
        print("Finished", description);
    }

    public void testFailure(Failure failure) throws Exception {
        print("Failed", failure.getDescription());
    }

    public void testAssumptionFailure(Failure failure) {
        print("Assumption failed", failure.getDescription());
    }

    public void testIgnored(Description description) throws Exception {
        print("Ignored", description);
    }

    private void print(String actionName, Description description) {
        System.out.println(actionName + "(method name): " + description.getMethodName());
        System.out.println(actionName + "(class name): " + description.getClassName());
        System.out.println(actionName + "(display name): " + description.getDisplayName());
    }
}