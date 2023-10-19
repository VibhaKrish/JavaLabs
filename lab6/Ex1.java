package Lab_ex6;
import java.util.*;

public class ex_1 {
	public static List<String> getValues(HashMap<Number, String> hashMap) {
        List<String> valuesList = new ArrayList<>(hashMap.values());
        Collections.sort(valuesList);
        return valuesList;
    }

    public static void main(String[] args) {
        HashMap<Number, String> hashMap = new HashMap<>();
        hashMap.put(1, "Ferrari");
        hashMap.put(2, "Lamborgini");
        hashMap.put(3, "Audi");
        hashMap.put(4, "Mercedes Benz");
        List<String> sortedValues = getValues(hashMap);
        
        System.out.println("Sorted Values: " + sortedValues);
    }
}


