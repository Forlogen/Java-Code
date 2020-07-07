package ObjectTest;

class Customer{
    int id = 1001;
    String name;
    Account acct;

    {
        name = "ÄäÃû¿Í»§";
    }
    public Customer(){
        acct = new Account();
    }

}
class Account{

}

public class CustomerTest {
    public static void main(String[] args) {
        Customer cust = new Customer();
    }
}
