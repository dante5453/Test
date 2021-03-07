public class ConsoleView {

    public void mainMenu() {
        System.out.println(ConsoleViewText.MAIN_MENU);
        System.out.println(ConsoleViewText.KNIGHT_STATUS);
        System.out.println(ConsoleViewText.AMMUNITION);
        System.out.println(ConsoleViewText.PUT_AMMO_KNIGHT);
        System.out.println(ConsoleViewText.SORTING_OF_AMMUNITION);
        System.out.println(ConsoleViewText.SEARCH_FOR_AMMUNITION);
        System.out.println(ConsoleViewText.EXIT);
        System.out.println(ConsoleViewText.SELECTING_OPTION);
    }

    public void selectingOption() {
        System.out.println(ConsoleViewText.SELECTING_OPTION);
    }

    public void sword() {
        System.out.println(ConsoleViewText.SWORD);
    }

    public void helmet() {
        System.out.println(ConsoleViewText.HELMET);
    }

    public void knightEquipment() {
        System.out.println(ConsoleViewText.KNIGHT_EQUIPMENT);
    }

    public void pointWhitespace() {
        System.out.println(ConsoleViewText.POINT_WHITESPACE);
    }

    public void costAmmunition() {
        System.out.println(ConsoleViewText.COST_AMMUNITION);
    }

    public void costAmmunition(int cost) {
        System.out.printf("%s %d", ConsoleViewText.COST_AMMUNITION, cost);
        System.out.println();
    }

    public void weightAmmunition() {
        System.out.println(ConsoleViewText.WEIGHT_AMMUNITION);
    }

    public void weightAmmunition(int weight) {
        System.out.printf("%s %d", ConsoleViewText.WEIGHT_AMMUNITION, weight);
        System.out.println();
    }

    public void damageAmmunition() {
        System.out.println(ConsoleViewText.DAMAGE_AMMUNITION);
    }

    public void damageAmmunition(int damage) {
        System.out.printf("%s %d", ConsoleViewText.DAMAGE_AMMUNITION, damage);
        System.out.println();
    }

    public void armorAmmunition() {
        System.out.println(ConsoleViewText.PROTECTION_AMMUNITION);
    }

    public void armorAmmunition(int armor) {
        System.out.printf("%s %d", ConsoleViewText.PROTECTION_AMMUNITION, armor);
        System.out.println();
    }

    public void sortType() {
        System.out.println(ConsoleViewText.SORT_TYPE);
    }

    public void costSortType() {
        System.out.println(ConsoleViewText.COST);
    }

    public void weightSortType() {
        System.out.println(ConsoleViewText.WEIGHT);
    }

    public void methodSearchingAmmunition() {
        System.out.println(ConsoleViewText.METHOD_SEARCHING_AMMUNITION);
    }

    public void minCost() {
        System.out.println(ConsoleViewText.MIN_COST);
    }

    public void maxCost() {
        System.out.println(ConsoleViewText.MAX_COST);
    }

    public void minWeight() {
        System.out.println(ConsoleViewText.MIN_WEIGHT);
    }

    public void maxWeight() {
        System.out.println(ConsoleViewText.MAX_WEIGHT);
    }

    public void bye() {
        System.out.println(ConsoleViewText.BYE);
    }

    public void error() {
        System.out.println(ConsoleViewText.ERROR);
    }

    public void enterSwordWeight() {
        System.out.print(ConsoleViewText.ENTER_SWORD_WEIGHT);
    }

    public void enterSwordCost() {
        System.out.print(ConsoleViewText.ENTER_SWORD_COST);
    }

    public void enterSwordDamage() {
        System.out.print(ConsoleViewText.ENTER_SWORD_DAMAGE);
    }

    public void enterHelmetWeight() {
        System.out.print(ConsoleViewText.ENTER_HELMET_WEIGHT);
    }

    public void enterHelmetCost() {
        System.out.print(ConsoleViewText.ENTER_HELMET_COST);
    }

    public void enterHelmetArmor() {
        System.out.print(ConsoleViewText.ENTER_HELMET_ARMOR);
    }
}
