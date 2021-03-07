public class Sword implements Ammunition {
    ConsoleView consoleView = new ConsoleView();

    @Override
    public int getCost() {
        consoleView.enterSwordCost();
        return Test.input().nextInt();
    }

    @Override
    public int getSpecialParameter() {
        consoleView.enterSwordDamage();
        return Test.input().nextInt();
    }

    @Override
    public int getWeight() {
        consoleView.enterSwordWeight();
        return Test.input().nextInt();
    }

    @Override
    public String toString() {
        return "Sword {cost=" + getCost() + ", weight=" + getWeight() + ", damage=" + getSpecialParameter() + "}";
    }
}
