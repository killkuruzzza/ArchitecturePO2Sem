public class MoneyReward implements iGameItem{
    protected int amount;

    public MoneyReward(int amount) {
        this.amount = amount;
    }

    @Override
    public void open() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Money: " + amount;
    }
}
