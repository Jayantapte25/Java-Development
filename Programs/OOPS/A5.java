
class Account{
    public String name;
    protected String email;
    private String password;

    public void setPassword(String pass){
        this.password = pass;
    }

    public String getPassword(){
        return this.password;
    }
}

public class A5 {
    public static void main(String[] args) {
        Account a = new Account();
        a.name = "Jayant";
        a.email = "jayantapte34@gmail.com";
        a.setPassword("abcd");
        System.out.println(a.getPassword());
    }
}
