package Proxy.CglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Agent implements MethodInterceptor {
    private Object obj;

    public Agent(Object obj) {
        this.obj = obj;
    }

    public Object getProxyInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(obj.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("before cglib proxy...");
        method.invoke(obj, args);
        System.out.println("after cglib proxy...");
        return null;
    }
}
