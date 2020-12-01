import org.junit.Assert;
import org.junit.Test;


public class FindThreeTests {

    @Test
    public void findThreeNumbersTestPass() {
        FindThree threeNum = new FindThree();
        int inputs[] = { 0, 2, 3, 6 };
        int total = 9;

        String result = threeNum.findThreeNumbers(inputs, inputs.length, total);
        Assert.assertTrue("Result of input", result.equalsIgnoreCase("[0, 3, 6]"));


    }
}
