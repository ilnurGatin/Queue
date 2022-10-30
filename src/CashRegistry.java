import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class CashRegistry {
    Random random = new Random();
    private Queue<String> firstRegistry = new LinkedList<>();

    private Queue<String> secondRegistry = new LinkedList<>();

    private Queue<String> thirdRegistry = new LinkedList<>();

    public void addPerson(String name) {
        if (firstRegistry.size() == 5 && secondRegistry.size() == 5 && thirdRegistry.size() == 5) {
            System.out.println("Позовите Галю");
        } else if (firstRegistry.size() < secondRegistry.size() && firstRegistry.size() < thirdRegistry.size() || firstRegistry.size() == secondRegistry.size() && firstRegistry.size() == thirdRegistry.size()) {
            firstRegistry.offer(name);
        } else if (secondRegistry.size() < firstRegistry.size() && secondRegistry.size() < thirdRegistry.size()) {
            secondRegistry.offer(name);
        } else {
            thirdRegistry.offer(name);
        }
    }

    public void removePerson() {
        int i = random.nextInt(3);
        if (i == 1 && !firstRegistry.isEmpty()) {
            firstRegistry.poll();
        } else if (i == 2 && !secondRegistry.isEmpty()) {
            secondRegistry.poll();
        } else if (!thirdRegistry.isEmpty()) {
            thirdRegistry.poll();
        } else {
            System.out.println("В очереди никого");
        }
    }

}
