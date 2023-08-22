import java.util.ArrayList;
import java.util.List;
// package collectionFrameworks;
public class arrayList {
    public static void main(String[] args) {
        List<person> arrayList = new ArrayList<>();
        // l.add("A");
        // l.add(10);
        // l.add("a");
        // l.add(null);
        // System.out.println(l);
        // l.remove(2);
        // System.out.println(l);
        // l.add(2, "M");
        // l.add("N");
        // System.out.println(l);

        arrayList.add(new person(1,"shishir",500.50));
        for(int i =0;i<arrayList.size();i++){
                System.out.println("ID= " +arrayList.get(i).getId());
                System.out.println("Name= " +arrayList.get(i).getName());
                System.out.println("Salary= " +arrayList.get(i).getSalary());
        }
        
    }
}
