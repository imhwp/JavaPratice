package proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

/**
 * JDK实现的动态代理要求：
 * 1.被代理对象实现了某个接口
 * 2.需要实现InvocationHandler,并重写invoke方法，在方法里实现代理的细节。
 * 3.通过Proxy.newInstance(ClassLoader classloader,Class/</?>[] interfaces,InvocationHandler h)获取代理对象，以接口的方式接收
 */
public class Main {
    public static void main(String[] args) {
        Sms proxy = (Sms) JDKProxyFactory.getProxy(new AliSms());
        proxy.send("代理");
    }
}
