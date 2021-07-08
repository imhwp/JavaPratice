package proxy.staticProxy;

public class AwsSms implements Sms{
    @Override
    public void send(String message) {
        System.out.println("Aws发送了短信，内容:"+message);
    }
}
