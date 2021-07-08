package proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;

public class CglibProxyFactory {
    public static Object getProxy(Class clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(clazz.getClassLoader());
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new MyMethodInterceptor());
        return enhancer.create();
    }
}
