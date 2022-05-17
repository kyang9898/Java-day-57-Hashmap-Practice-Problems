import java.util.HashMap;
import java.util.Map;

public class IOweYou {
    private HashMap<String, Double> IOweYouMap = new HashMap<>();

    public IOweYou() {
    }

    public void setSum(String toWhom, double amount) {
        IOweYouMap.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        for (Map.Entry<String, Double> iouMap : IOweYouMap.entrySet()) {
            if (iouMap.getKey().equalsIgnoreCase(toWhom)) {
                return iouMap.getValue();
            }
        }
        return 0;
    }


}

