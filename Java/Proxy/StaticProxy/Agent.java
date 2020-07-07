package Proxy.StaticProxy;

public class Agent implements Person{
    Star star;

    public Agent(Star star) {
        this.star = star;
    }

    @Override
    public void say(String name) {
        star.say(name);
    }
}
