package proxy.staticProxy;

public class AliSms implements Sms{

    @Override
    public void send(String message) {
        System.out.println("发送了阿里云短信");
    }
}
