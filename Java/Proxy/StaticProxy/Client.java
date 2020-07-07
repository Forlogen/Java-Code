package Proxy.StaticProxy;

public class Client {
    public static void main(String[] args) {
        String name = "Forlogen";
        Star star = new Star();
        Agent agent = new Agent(star);
        agent.say(name);
    }
}
