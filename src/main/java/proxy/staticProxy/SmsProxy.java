package proxy.staticProxy;

public class SmsProxy {
    private Sms sms;
    private Logger logger;

    public SmsProxy(Sms sms){
        this.sms = sms;
        this.logger = new Logger();
    }

    public void send(String message){
        logger.info("短信接口被调用");
        sms.send(message);
    }

    public static void main(String[] args) {
        SmsProxy smsProxy = new SmsProxy(new AliSms());
        smsProxy.send("验证码");
        SmsProxy smsProxy2 = new SmsProxy(new AwsSms());
        smsProxy2.send("验证码");
    }
}
