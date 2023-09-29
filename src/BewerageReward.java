public class BewerageReward implements iGameItem{
    private String name;
    private boolean isHot;

    BewerageReward(String name, boolean isHot){
        this.name = name;
        this.isHot = isHot;
    }


    @Override
    public String toString() {
        String result = "Награда напиток: ";
        if (isHot) result += "горячий ";
        else result += "холодный ";
        return result + name;
    }

    @Override
    public void open() {
        System.out.println(this);
    }
}
