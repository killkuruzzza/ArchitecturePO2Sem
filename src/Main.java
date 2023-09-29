import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        ItemFabric generator = new GoldGenerator();
//        generator.openRewgard();
//        generator = new GoldGenerator();
//        generator.openRewgard();
//    }
//}

        // ItemFabric generator = new GoldGenerator();
        // generator.openReward();
        // generator = new GemGenerator();
        // generator.openReward();
        //System.out.println("Hello, World!");

        Random rnd = new Random();
        List<ItemFabric> fabricList = new ArrayList<>();

        fabricList.add(new GoldGenerator());
        fabricList.add(new MoneyGenerator());
        fabricList.add(new BewerageGenerator());

        for (int i = 0; i < 20; i++) {
            int index = rnd.nextInt(fabricList.size());
            ItemFabric fabric = fabricList.get(index);
            fabric.openRewgard();
        }
    }
}

/*
* abstract class ItemFabric
*   openReward
*   createItem
* interface iGameItem
*   open
*gold
*gem
*
* */