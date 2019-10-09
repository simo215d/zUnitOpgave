import java.util.Arrays;

public abstract class TestSuite {

    private int passed;
    private int failed;

    public void runTestSuite() {
        passed = 0;
        failed = 0;
        testList();
        System.out.println("tests passed: "+passed);
        System.out.println("tests failed: "+failed);
    }

    protected abstract void testList();

    //you can overload this method by creating same method name but taking different parameters.
    public void assertEquals(int expected, int actual) {
        if (expected == actual){
            passed++;
        } else {
            failed++;
            System.out.println("Expected: "+expected+" \nActual: "+actual);
            System.out.println();
        }
    }

    public void assertEquals(String message, int expected, int actual) {
        if (expected == actual){
            passed++;
        } else {
            failed++;
            System.out.println(message+"\nExpected: "+expected+" \nActual: "+actual);
            System.out.println();
        }
    }

    public void assertEquals(double expected, double actual) {
        if (expected == actual){
            passed++;
        } else {
            failed++;
            System.out.println("Expected: "+expected+" \nActual: "+actual);
            System.out.println();
        }
    }

    public void assertEquals(int[] expected, int[] actual) {
        if (Arrays.equals(expected,actual)){
            passed++;
        } else {
            failed++;
            System.out.println("Expected: "+Arrays.toString(expected)+" \nActual: "+Arrays.toString(actual));
            System.out.println();
        }
    }

    public static void main(String[] args) {

    }
}