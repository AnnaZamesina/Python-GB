import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
public class task025 {

    public static LinkedList<String> reversList(LinkedList<String> collection) {
        for (int j = 0; j < (collection.size()) / 2; j++) {
            String temp = collection.get(j);
            collection.set(j, collection.get(collection.size() - j - 1));
            collection.set(collection.size() - j - 1, temp);
        }
        return collection;
    }

    public static void main(String[] args) {
        LinkedList<String> listLink = new LinkedList<>();
        listLink.add("Zamesina");
        listLink.add("Anna");
        listLink.add("Pavlovna");
        listLink.add("Salavat");
        System.out.println(listLink);
        reversList(listLink);
        System.out.println(listLink);
    }
}