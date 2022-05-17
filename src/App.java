import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        // Abbreviations Exercise
        HashMap<String, String> nickname = new HashMap<>();
        nickname.put("matthew", "matt");
        nickname.put("michael", "mix");
        nickname.put("arthur", "artie");
        System.out.println(nickname.get("matthew"));
        String name = nickname.get("matthew");
        System.out.println(name);

        // Abbreviations Exercise
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part : text.split(" ")) {
            if (abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();

        // Print Me My Hashmap Exercise
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }

    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap,
            String text) {
        for (Map.Entry<String, String> abbreviationMap : hashmap.entrySet()) {
            if (abbreviationMap.getKey().contains(text)) {
                System.out.println(abbreviationMap.getValue());
            }
        }
    }
}

    // // Print Me Another Hashmap Exercise
    // HashMap<String, Book> hashmap = new HashMap<>();hashmap.put("sense",new Book("Sense and Sensibility",1811,"..."));hashmap.put("prejudice",new Book("Pride and prejudice",1813,"...."));

    // printValues(hashmap);
    //     System.out.println("---");
    //     printValueIfNameContains(hashmap, "prejud");

    //        //I Owe You Exercise
    // IOweYou mattsIOweYou = new IOweYou();
    // mattsIOweYou.setSum("Arthur", 51.5);
    // mattsIOweYou.setSum("Michael", 30);

    // System.out.println(mattsIOweYou.howMuchDoIOweTo("Arthur"));
    // System.out.println(mattsIOweYou.howMuchDoIOweTo("Michael"));
    // }

