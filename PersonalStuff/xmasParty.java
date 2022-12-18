import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
 
class App { 
    
    public static void main(String[] args) { 
        ArrayList<String> names = new ArrayList<String>();
        names.add("Andre"); names.add("Angelo"); names.add("Aldrin"); names.add("Allen"); names.add("Aljean"); names.add("Ara");
        names.add("Blix"); names.add("Brando"); names.add("Brix");
        names.add("Cristian");
        names.add("Dawson"); names.add("Dhan"); names.add("Diana"); names.add("Divina");
        names.add("Earl"); names.add("Eric");
        names.add("Fat"); names.add("Franze"); names.add("Francyne");
        names.add("Gerick"); names.add("Gian"); 
        names.add("Iber");
        names.add("Jassy"); names.add("Jasper"); names.add("Jerico"); names.add("Jessy"); names.add("Jillian");
        names.add("kali"); names.add("Kristel");
        names.add("Luis");
        names.add("Mico"); names.add("Miko"); names.add("Migs"); names.add("Mureigne");
        names.add("Nicko");
        names.add("Rico"); names.add("Robbie"); names.add("Rovic");
        names.add("Uriel");
        names.add("Wilde");

        ArrayList<String> sec_list = new ArrayList<String>();
        sec_list = (ArrayList)names.clone();

        int[] range = IntStream.rangeClosed(1, 40).toArray();
        List<Integer> intlist = new ArrayList<Integer>();

        for (int number : range) 
            intlist.add(number);
    
        ArrayList<String[]> groups = new ArrayList<String[]>();
        int i = 0;

        while (intlist.size() > 0) {
            if (intlist.size() <= 0 ) 
                break;
            if (intlist.size() == 1) {
                String[] tempAray = {names.get(0), sec_list.get(0)};
                groups.add(i, tempAray);
                break;
            }

            int x = (int) Math.floor(Math.random() * intlist.size());
            int y = (int) Math.floor(Math.random() * intlist.size());
            System.out.println("x ==: " + x + " y ==: " + y + " size ==: " + intlist.size());

            if (names.get(x) == sec_list.get(y) && (x == 0 && y == 0))
                break;
            else if (names.get(x) == sec_list.get(y))
                continue;
            
            String[] tempAray = {names.get(x), sec_list.get(y)};

            groups.add(i, tempAray);
            i++;
            intlist.remove(intlist.get(x));
            names.remove(names.get(x));
            sec_list.remove(sec_list.get(y));
        }
        for (String[] strings : groups) 
            System.out.println(Arrays.toString(strings));
    }
}




