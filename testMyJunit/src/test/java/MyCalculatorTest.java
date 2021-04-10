import com.yc.biz.Calculator;
import com.yc.junit.*;

public class MyCalculatorTest {

    private Calculator cal;//待测试的单元

    @MyBeforeClass
    public  static void bc(){
        System.out.println("beforeclass");
    }

    @MyBefore  //执行测试方法前要调用的
    public void setUp() throws Exception {
        System.out.println("before...");
        cal=new Calculator();
    }

    @MyAfter  //执行测试方法后要调用的
    public void tearDown() throws Exception {
        System.out.println("after...");
    }

    @MyAfterClass
    public  static  void  ac(){
        System.out.println("afterclass");
    }

    @MyTest
    public void add() {
        System.out.println("add测试。。。");
    }

    @MyTest
    public void sub() {
        System.out.println("sub测试。。。");
    }
}
