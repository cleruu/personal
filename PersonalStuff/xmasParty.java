import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
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

        ArrayList<String[]> groups = new ArrayList<String[]>();
        int i = 0;

        while (names.size() > 0) {
            if (names.size() <= 0 ) 
                break;

            int x = (int) Math.floor(Math.random() * names.size());
            int y = (int) Math.floor(Math.random() * names.size());
            System.out.println("x ==: " + x + " y ==: " + y + " size ==: " + names.size());

            if (x == y || (x < 0|| y < 0))
                continue;
            
            String[] tempAray = {names.get(x), names.get(y)};

            groups.add(i, tempAray);
            i++;
            List<String> list = Arrays.asList(tempAray);

            names.removeAll(list);
        }

        for (String[] strings : groups) 
            System.out.println(Arrays.toString(strings));
    }
}
