package proxy.dynamic.cglib;

public class Main {
    public static void main(String[] args) {
        AliSms aliSms = (AliSms) CglibProxyFactory.getProxy(AliSms.class);
        aliSms.sendText("text");
    }
}
