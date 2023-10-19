package lab6.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Lab6Ex1 {
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
