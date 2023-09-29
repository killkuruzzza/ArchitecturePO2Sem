import java.util.Random;

public class MoneyGenerator extends ItemFabric{
    Random random = new Random();
    @Override
    public iGameItem createItem() {
        return new MoneyReward(random.nextInt(1,100 ));
    }
}
