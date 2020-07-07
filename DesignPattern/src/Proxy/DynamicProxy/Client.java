package Proxy.DynamicProxy;


public class Client {
    public static void main(String[] args) {
        System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Star star = new Star();
        Agent agent = new Agent(star);
        Person proxyInstance = (Person)agent.getProxyInstance();
        proxyInstance.say("Forlogen");
        /*
        before invoke...
        RealClass is:Proxy.DynamicProxy.Star@511d50c0 and method is: say
        Hello Forlogen
        after invoke...
         */
    }
}
