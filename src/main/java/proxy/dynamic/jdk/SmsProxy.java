package proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SmsProxy implements InvocationHandler {
    private Object target;
    public SmsProxy(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("--代理方法前置--");
        Object result = method.invoke(target,args[0]);
        System.out.println("--代理方法后置--");
        return result;
    }
}
