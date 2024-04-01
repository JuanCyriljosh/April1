import java.util.HashMap;
import java.util.Map;

public class HashMapDemo{
    public static void main(String[] args){
        Student stud1 = new Student();
        stud1.setStudNo("1234");
        stud1.setLastName("Dela Cruz");
        stud1.setFirstName("Juan");
        stud1.setProgramCode("BSCS");

        Student stud2 = new Student();
        stud2.setStudNo("5678");
        stud2.setLastName("Santos");
        stud2.setFirstName("Maria");
        stud2.setProgramCode("BSIT");

        Student stud3 = new Student();
        stud3.setStudNo("9876");
        stud3.setLastName("Hernandez");
        stud3.setFirstName("Olivia");
        stud3.setProgramCode("BSEMC");

        HashMap<String, Student> studentMap = new HashMap<>();
        // put the value
        studentMap.put(stud1.getStudNo(), stud1);
        studentMap.put(stud2.getStudNo(), stud2);
        studentMap.put(stud3.getStudNo(), stud3);

    

        System.out.println(studentMap);

        //extract its value
        for (Map.Entry<String, Student> entryMap : studentMap.entrySet()) {
            System.out.println("Student number is: " + entryMap.getValue().getStudNo());
            System.out.println("Student name is: " + entryMap.getValue().getLastName() + ", " + 
					             entryMap.getValue().getFirstName());
            System.out.println("Program is: " + entryMap.getValue().getProgramCode() + "\n");
            
        }
    }
}