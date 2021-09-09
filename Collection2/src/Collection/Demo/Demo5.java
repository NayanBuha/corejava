package Collection.Demo;

import java.util.*;

class AgeComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}

public class Demo5 {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
		
		System.out.println("sorting by Age");  
		Collections.sort(al,new AgeComparator());  
		for(Student st: al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  

		}
	}
}



