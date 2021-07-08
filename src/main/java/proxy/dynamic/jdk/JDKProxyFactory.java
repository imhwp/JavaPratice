package proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

public class JDKProxyFactory {
    public static Object getProxy(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),new SmsProxy(target));
    }
}
