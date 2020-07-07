package Proxy.CglibProxy;

public class Client {
    public static void main(String[] args) {
        Star star = new Star();
        Agent agent = new Agent(star);
        Star proxyInstance = (Star)agent.getProxyInstance();
        proxyInstance.say("Forlgoen");
    }
}
