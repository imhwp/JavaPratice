package proxy.dynamic.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("将要执行的方法名称："+ method.getName());
        Object res = methodProxy.invokeSuper(o,objects);
        System.out.println("方法："+method.getName()+"执行结束");
        return res;
    }
}
