import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CashRegistry cashRegistry = new CashRegistry();
        for (int i = 0; i < 15; i++) {
            cashRegistry.addPerson("Costumer" + i);
        }

        cashRegistry.addPerson("Costumer16");

        cashRegistry.removePerson();

        cashRegistry.addPerson("Costumer16");

        List<List<Integer>> biDemArrList = new ArrayList<>();

        exampleFirst();

        exampleSecond();



    }


    public static void exampleFirst() {
        List<List<String>>  biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add(j, "◯");
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void exampleSecond() {
        List<List<String>>  biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0 && j % 2 > 0) {
                    biDemArrList.get(i).add(j, "●");
                } else if (i % 2 != 0 && j % 2 == 0) {
                    biDemArrList.get(i).add(j, "●");
                } else {
                    biDemArrList.get(i).add(j, "◯");
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

}