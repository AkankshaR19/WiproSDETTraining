package day10;
import java.util.*;

class Patient2 {
    int id;
    String name;

    Patient2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class HospitalRecordSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Patient2> map = new HashMap<>();

        while (true) {
            System.out.println("\n1.Add 2.Update 3.Get 4.Remove 5.View 6.Exists 7.Count 8.Clear 9.Exit");
            int ch = sc.nextInt(); sc.nextLine();

            switch (ch) {
                case 1:
                    int id = sc.nextInt(); sc.nextLine();
                    String name = sc.nextLine();
                    map.put(id, new Patient2(id, name));
                    break;

                case 2:
                    id = sc.nextInt(); sc.nextLine();
                    if (map.containsKey(id))
                        map.put(id, new Patient2(id, sc.nextLine()));
                    break;

                case 3:
                    id = sc.nextInt();
                    System.out.println(map.get(id));
                    break;

                case 4:
                    id = sc.nextInt();
                    map.remove(id);
                    break;

                case 5:
                    for (Patient2 p : map.values())
                        System.out.println(p);
                    break;

                case 6:
                    id = sc.nextInt();
                    System.out.println(map.containsKey(id));
                    break;

                case 7:
                    System.out.println(map.size());
                    break;

                case 8:
                    map.clear();
                    System.out.println("Cleared");
                    break;

                case 9:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
