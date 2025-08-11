package listSetMap.nivel1;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<String, String> paisCapital = new HashMap<>();

        paisCapital.put("Brasil", "Brasília");
        paisCapital.put("Japão", "Tóquio");
        paisCapital.put("França", "Paris");

        paisCapital.values().forEach(System.out::println);

        System.out.println("////////");

        for (Map.Entry<String, String> entry : paisCapital.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
