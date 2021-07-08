package proxy.dynamic.cglib;

public class AliSms {
    public void sendText(String message){
        System.out.println("阿里云发送了文本短信，内容："+message);
    }

    public void sendRichText(String message){
        System.out.println("阿里云发送了彩信，内容："+message);
    }
}
