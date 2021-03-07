
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.equip(test.helmet());
        test.equip(test.helmet());
        test.printArray(test.ammunition);
    }

    public static Scanner input() {
        return new Scanner(System.in);
    }

    private Ammunition[] ammunition = new Ammunition[0];

    public Ammunition[] getAmmunition() {
        return  ammunition;
    }
    Sword sword = new Sword();
    Helmet helmet = new Helmet();
    public void equip(Ammunition element) {
        Ammunition[] newAmmunitionList = Arrays.copyOf(ammunition,ammunition.length + 1);
        newAmmunitionList[newAmmunitionList.length - 1] = element;
        ammunition = newAmmunitionList;
    }

    public Sword sword() {
        Sword sword = new Sword();
        sword.getCost();
        sword.getWeight();
        sword.getSpecialParameter();
        return sword;
    }

    public Helmet helmet() {
        Helmet helmet = new Helmet();
        helmet.setCost();
        helmet.setWeight();
        helmet.setSpecialParameter();
        return helmet;
    }

    public void printArray(Object[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Sword {cost=" + sword().getCost() + ", weight=" + sword().getWeight() + ", damage=" + sword().getSpecialParameter() + "}";
    }


}

