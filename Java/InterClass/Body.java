package InterClass;

public class Body {
    private String name = "body";
    private String state = "healthy";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void methodBody(){
        System.out.println("outer class...");
        // 间接调用内部类
        new Heart().beat();
    }

    //成员内部类
    public class Heart{
        String name = "HEART";

        public void beat(){
            System.out.println(state);
            System.out.println("beat...");
//            System.out.println(name);
        }

        public void show(){
            String name = "heart";
            // 解决重名变量问题
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Body.this.name);
        }
    }
}
