import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, ArrayList<Object>> map = new HashMap<>();
        String name = "Mark";
        Date birthday = new Date(2022, 9, 24);

// Get the next available key
        int nextKey = map.size() + 1;

// Add key-value pairs to the map
        ArrayList<Object> values = new ArrayList<>();
        values.add(name);
        values.add(birthday);
        map.put(nextKey, values);

// Print the map
        for (Map.Entry<Integer, ArrayList<Object>> entry : map.entrySet()) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
            String dateString = formatter.format(entry.getValue().get(1));
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue().get(0) + ", " + dateString);
        }
    }
}