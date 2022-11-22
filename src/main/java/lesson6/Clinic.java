package lesson6;

import java.util.HashSet;
import java.util.Set;

public class Clinic {
    public static Set<Cat> catsSet;

    public static void main(String[] args) {

        Cat cat1 = new Cat("Snegok", "waite", "nevsky", 3);
        Cat cat2 = new Cat("Markiz", "red", "bengali", 1);
        Cat cat3 = new Cat("Murka", "black", "oriental", 6);
        Cat cat4 = new Cat("Uasya", "brown", "mongrel", 2);
        Cat cat5 = new Cat("Uasya", "brown", "mongrel", 2);
        Cat cat6 = new Cat("Uasya", "brown", "mongrel", 2);

        catsSet = new HashSet<>();
        catsSet.add(cat1);
        catsSet.add(cat2);
        catsSet.add(cat3);
        catsSet.add(cat4);
        catsSet.add(cat5);
        catsSet.add(cat6);

        System.out.println("1. cat1 -> " + cat1);
        System.out.println();

        System.out.println("2. " + catsSet.toString());
        System.out.println();

        System.out.println("3. " + catsSet + "\nsize: " + catsSet.size());
        System.out.println();

        System.out.println("4. Сравнение экземпляров: \n   cat1 == cat6 -> " + cat1.equals(cat6) + "\n   cat4 == cat6 -> " + cat4.equals(cat6));
        System.out.println();

        System.out.println("5. cat4 has id: " + cat4.hashCode() + "\n cat5 has id: " + cat5.hashCode() + "\n cat6 has id: " + cat6.hashCode());
        System.out.println();

        System.out.println("6. " + catsSet + "\nsize: " + catsSet.size());
    }
}
