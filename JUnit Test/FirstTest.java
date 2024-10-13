import org.junit.*;;
public class FirstTest {
    @Test
    public void test(){
        FirstCode first = new FirstCode();
        Assert.assertEquals("Hello", first.says());
    }
    
}
