package Proxy.CglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Client {
    public static void main(String[] args) {
        Star star = new Star();
        Agent agent = new Agent(star);
//        Star proxyInstance = (Star)agent.getProxyInstance();
//        proxyInstance.say("Forlgoen");

        /*
        使用匿名内部类方法使用cglib实现动态代理
         */
        Star proxyStar = (Star) Enhancer.create(star.getClass(), new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                Object rtValue= null;
                System.out.println("before cglib proxy...");
                rtValue = method.invoke(star, args);
                System.out.println("after cglib proxy...");
                return rtValue;
            }
        });

        proxyStar.say("Forlogen");
    }
}
