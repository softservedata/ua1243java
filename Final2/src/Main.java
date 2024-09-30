import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static final Path FILE_1 = Paths.get("D:\\Java_projects\\file1.txt");
    public static final Path FILE_2 = Paths.get("D:\\Java_projects\\file2.txt");

        public static void main (String[]args) throws IOException {
            long time = System.currentTimeMillis();
            findElementsPresentInBothList1();
            System.out.println(System.currentTimeMillis() - time+" milliseconds");

            long time2 = System.currentTimeMillis();
            findElementsPresentInBothList2();
            System.out.println(System.currentTimeMillis() - time2+" milliseconds");

            long time3 = System.currentTimeMillis();
            findElementsPresentInBothList3();
            System.out.println(System.currentTimeMillis() - time3+" milliseconds");
        }


    public static void findElementsPresentInBothList1 () throws IOException {
            List<String> list1 = Files.readAllLines(FILE_1);
            List<String> list2 = Files.readAllLines(FILE_2);

            List<String> elementIdenticallyList = new LinkedList<>(list1);
            elementIdenticallyList.retainAll(list2);

            System.out.println("The number of the same line is: "+elementIdenticallyList.size());
            System.out.println(elementIdenticallyList);
        }

    public static void findElementsPresentInBothList2 () throws IOException {
        List<String> list1 = Files.readAllLines(FILE_1);
        List<String> list2 = Files.readAllLines(FILE_2);
        List<String>  result =  list2.stream()
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
                        setView -> setView.isEmpty() ? list1 :
                                list1.stream().filter(setView::contains)
                                        .collect(Collectors.toList())));
        System.out.println("The number of the same line is: "+result.size());
        System.out.println(result);
    }
    public static void findElementsPresentInBothList3() throws IOException {
        List<String> list1 = Files.readAllLines(FILE_1);
        List<String> list2 = Files.readAllLines(FILE_2);

        Set<String> set2 = new HashSet<>(list2);
        List<String> result =  list1.stream()
                .filter(set2::contains)
                .collect(Collectors.toList());
        System.out.println("The number of the same line is: "+result.size());
        System.out.println(result);

    }
}

