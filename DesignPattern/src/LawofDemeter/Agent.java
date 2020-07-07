package LawofDemeter;


public class Agent {
    Star myStar;
    Company company;

    public Star getMyStar() {
        return myStar;
    }

    public void setMyStar(Star myStar) {
        this.myStar = myStar;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void meeting(){
        System.out.println("meeting...");
    }

    public void business(){
        System.out.println("doing business...");
    }
}
