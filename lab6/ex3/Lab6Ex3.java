package lab6.ex3;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex3 {
	public static void main(String[] args) {
        int[] num = {4,5,6,8,32,12};
        Map<Integer, Integer> getSquareMap = getSquares(num);

        for (Map.Entry<Integer, Integer> entry : getSquareMap.entrySet()) {
            System.out.println("Number: " + entry.getKey() + " -> Square: " + entry.getValue());
        }
    }

    public static Map<Integer, Integer> getSquares(int[] num) {
        Map<Integer, Integer> getSquareMap = new HashMap<>();
        
        for (int i : num) {
        	int n=i*i;
        	getSquareMap.put(i, n);
        }
        
        return getSquareMap;
    }
}
