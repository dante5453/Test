public class Helmet implements Ammunition {
    ConsoleView consoleView = new ConsoleView();
    private int cost;
    private int weight;
    private int armor;

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public int getSpecialParameter() {
        return armor;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    public int setCost() {
        consoleView.enterHelmetCost();
        this.cost = Test.input().nextInt();
        return cost;
    }

    public int setWeight() {
        consoleView.enterHelmetWeight();
        this.weight = Test.input().nextInt();
        return weight;
    }

    public int setSpecialParameter() {
        consoleView.enterHelmetArmor();
        this.armor = Test.input().nextInt();
        return armor;
    }

    @Override
    public String toString() {
        return "Helmet {cost=" + getCost() + ", weight=" + getWeight() + ", armor=" + getSpecialParameter() + "}" + System.lineSeparator();
    }


}
