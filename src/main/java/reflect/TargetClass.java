package reflect;

public class TargetClass {
    private String username = "hank";

    public void method1(String username){
        System.out.println("public method1 is running,username:"+username);
    }

    private void method2(){
        System.out.println("private method is running,username"+this.username);
    }

}
