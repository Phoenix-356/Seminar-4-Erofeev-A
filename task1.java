import java.util.LinkedList;

public class task1 {

    public static void main(String[] args) {
        
        String str_1 = new String("0");
        String str_2 = new String("1");
        String str_3 = new String("2");
        String str_4 = new String("3");
 
        LinkedList<String> rev = new LinkedList<>();
        rev.add(str_1);
        rev.add(str_2);
        rev.add(str_3);
        rev.add(str_4);
 
        System.out.println(rev);        
        rev_list(rev);
        System.out.println(rev);
    }

    private static LinkedList rev_list(LinkedList rev) {
        int count = rev.size();
        for (int i = count-1; i >= 0; i--) {
            rev.add(rev.get(i));           
        }
        for (int i = 0; i < count; i++) {
            rev.removeFirst();
        }
        return rev;
    }
}