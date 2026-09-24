import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTester {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Ravi", 25);
        map.put("Kavi", 30);
        map.put("Navi", 35);
        System.out.println(map);
        map.put(null, 5);
        System.out.println(map);
    }
}