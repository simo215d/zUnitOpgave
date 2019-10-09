public class TestClass extends TestSuite {
    @Override
    protected void testList() {
        testInt();
        testDouble();
        testArray();
    }

    public void testInt() {
        //pass
        int result = 5;
        assertEquals(5,result);
        //fail
        assertEquals(3,7);
        //fail with message
        assertEquals("WRONG!",4,6);
    }

    public void testDouble(){
        //pass
        double result = 5.34;
        assertEquals(5.34,result);
        //fail
        assertEquals(3.543,7.12);
    }

    public void testArray(){
        //pass
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        assertEquals(arr1,arr2);
        //fail
        int[] arr3 = {2,2,3};
        assertEquals(arr1,arr3);
    }
}