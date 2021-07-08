package proxy.dynamic.jdk;

public class AliSms implements Sms{
    @Override
    public void send(String message) {
        System.out.println("阿里云短信服务发送："+message);
    }
}
