package Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Agent implements InvocationHandler {
    Object obj;

    public Agent(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke...");
        System.out.println("RealClass is:" + this.obj.toString() + " and method is: " + method.getName());
        method.invoke(obj, args);
        System.out.println("after invoke...");
        return null;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }
}
