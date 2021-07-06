package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //首先通过反射获取类对象
        Class clazz = Class.forName("reflect.TargetClass");
        //通过类对象生成实例
        TargetClass o = (TargetClass) clazz.newInstance();
        //通过方法名获取类的方法
        Method method2 = clazz.getDeclaredMethod("method2");
        //由于方法是private修饰的，所以要取消安全检查
        method2.setAccessible(true);
        //调用该方法
        method2.invoke(o);
        //对类中参数进行修改
        Field username = clazz.getDeclaredField("username");
        username.setAccessible(true);
        username.set(o,"reflect hank");
        method2.invoke(o);
    }
}
