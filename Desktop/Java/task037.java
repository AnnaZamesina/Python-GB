import java.util.*;

//1. Создайте HashSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}. Распечатайте содержимое данного множества.
//2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}.  Распечатайте содержимое данного множества.
//3. Создайте TreeSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}.  Распечатайте содержимое данного множества.
public class task037 {
public static void main(String[] args) {
Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 5, 3));
System.out.println(set.add(3));
System.out.println(set.add(30));
System.out.println(set);
Set<Integer> setLinked = new LinkedHashSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
System.out.println(setLinked);
Set<Integer> setTree = new TreeSet<>(Comparator.reverseOrder());// Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
setTree.add(1);
setTree.add(30000);
setTree.add(2);
setTree.add(4);
setTree.add(5000);
setTree.addAll(Arrays.asList(4, 50, 6, 3, 1));
System.out.println(setTree);
}
}