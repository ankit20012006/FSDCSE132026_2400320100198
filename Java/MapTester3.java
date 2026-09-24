import java.util.HashMap;
import java.util.Map;

public class MapTester3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Ravi", 55);
        map.put("Kavi", 15);
        map.put("Navi", 50);
        map.put("Javi", -5);

        System.out.println(map);
        map.put("Ravi", 65);
        System.out.println(map);
        map.put(null, 5);
        System.out.println(map);
        map.put("Aavi",null);
        map.put("Bavi",null);
        System.out.println(map);
    }
}
