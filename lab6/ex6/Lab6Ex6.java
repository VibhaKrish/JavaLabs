package lab6.ex6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab6Ex6 {
	public static void main(String[] args) {
		Map<Integer, Integer> student=new HashMap<>();
		student.put(1221,18);
		student.put(1365,10);
		student.put(1421,12);
		student.put(1453,67);
		student.put(1287,87);
		student.put(1207,17);
		
        List<Integer> getVoters = getStudents(student);
 
       	System.out.println("People with these voter ID are eligible to Vote ");
        for(int i:getVoters) {
        	System.out.println(i);
        }
       
    }

    public static List<Integer> getStudents(Map<Integer, Integer> voter) {
    	List<Integer> voters=new ArrayList<Integer>();
        
        for (Map.Entry<Integer, Integer> entry : voter.entrySet()) {
        	if(entry.getValue()>18) {
        		voters.add(entry.getKey());
        	}
        }
        
        return voters;
    }
}
