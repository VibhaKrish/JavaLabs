package lab6.ex4;

import java.util.HashMap;
import java.util.Map;

public class Lab4Ex4 {
	public static void main(String[] args) {
		Map<Integer, Integer> student=new HashMap<>();
		student.put(1221,93);
		student.put(1365,70);
		student.put(1421,83);
		student.put(1453,90);
		student.put(1287,76);
		student.put(1207,36);
		
        Map<Integer, String> getStudentMap = getStudents(student);

        for (Map.Entry<Integer, String> entry : getStudentMap.entrySet()) {
            System.out.println("Student Id: " + entry.getKey() + " -> Medal Type: " + entry.getValue());
        }
    }

    public static Map<Integer, String> getStudents(Map<Integer, Integer> student) {
        Map<Integer, String> getScholorship=new HashMap<>();
        
        for (Map.Entry<Integer, Integer> entry : student.entrySet()) {
        	if(entry.getValue()>=90) {
        		getScholorship.put(entry.getKey(), "Gold");
        	}
        	else if(entry.getValue()>=80 && entry.getValue()<90) {
        		getScholorship.put(entry.getKey(), "Silver");
        	}
        	else if(entry.getValue()>=70 && entry.getValue()<80) {
        		getScholorship.put(entry.getKey(), "Bronze");
        	}
        	else {
        		getScholorship.put(entry.getKey(), "Not Eligible");
        	}
        }
        
        return getScholorship;
    }
}
