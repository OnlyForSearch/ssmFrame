package cn.fengyu.frame.demo.a5;

import org.springframework.stereotype.Component;

/**
 * Created by fengYu Administrator on 2015/12/29.
 */
@Component("arithmeticCalculator")
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

    @Override
    public int add(int i, int j) {
        return i+j;
    }
    @Override
    public int sub(int i, int j) {
        return i-j;
    }
    @Override
    public int mul(int i, int j) {
        return i*j;
    }
    @Override
    public int div(int i, int j) {
        return i/j;
    }
}
