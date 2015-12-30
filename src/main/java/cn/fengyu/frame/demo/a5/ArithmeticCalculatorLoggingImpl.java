package cn.fengyu.frame.demo.a5;

/**
 * Created by fengYu Administrator on 2015/12/30.
 */
//@Component("arithmeticCalculator")
public class ArithmeticCalculatorLoggingImpl implements ArithmeticCalculator {

    @Override
    public int add(int i, int j) {
        printlnBegin(i, j, "add");
        int result = i + j;
        printEnd(result, "add");
        return result;
    }
    private void printEnd(int result, final String methodName) {
        System.out.println("The method " + methodName + " ends with " + result);
    }
    private void printlnBegin(int i, int j, String method) {
        System.out.println("The method " + method + " begins with [" + i + "," + j + "]");
    }
    @Override
    public int sub(int i, int j) {
        printlnBegin(i, j, "sub");
        int result = i - j;
        printEnd(result, "sub");
        return result;
    }
    @Override
    public int mul(int i, int j) {
        printlnBegin(i, j, "mul");
        int result = i * j;
        printEnd(result, "mul");
        return result;
    }
    @Override
    public int div(int i, int j) {
        printlnBegin(i, j, "div");
        int result = i / j;
        printEnd(result, "div");
        return result;
    }
}
