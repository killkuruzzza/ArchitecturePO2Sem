import java.time.LocalTime;
import java.util.Random;

public class BewerageGenerator extends ItemFabric{
    Random random = new Random();
    @Override
    public iGameItem createItem() {
        LocalTime t = LocalTime.now();
        String drinkName;
        if (t.getHour() < 10) drinkName = "кофе";
        else if (t.getHour() < 18) drinkName = "чай";
        else drinkName = "какао";

        return new BewerageReward(drinkName, random.nextBoolean());
    }
}
