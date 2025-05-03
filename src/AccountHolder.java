public class AccountHolder implements Observer {
    private String name;

    public AccountHolder(String name) {
        this.name = name;
    }

    @Override
    public void update(double newBalance) {
        System.out.println(name + ", ваш новий баланс: " + newBalance + " грн");
    }
}