package cn.fengyu.frame.demo.a5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by fengYu Administrator on 2015/12/30.
 */
public class ArithmeticCalculatorLoggingProxy {

    private ArithmeticCalculator target;
    public ArithmeticCalculatorLoggingProxy(ArithmeticCalculator target) {
        this.target = target;
    }

    public ArithmeticCalculator getLoggerProxy() {
        ArithmeticCalculator proxy= null;

        ClassLoader classLoader = target.getClass().getClassLoader();
        Class []interfaces=new Class[]{ArithmeticCalculator.class};

        InvocationHandler handler=new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String methodName = method.getName();
                System.out.println(method);
                Object result=null;

                result=method.invoke(target, args);


                return null;
            }

        };

        proxy = (ArithmeticCalculator)Proxy.newProxyInstance(classLoader, interfaces, handler);
        return proxy;

    }



}
