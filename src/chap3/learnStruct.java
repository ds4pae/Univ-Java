package chap3;

class Person{
	String name;
	int age;
	int height;
	
	void setName(String inputName) {
		name = inputName;
	}
}

class TV{
	String name;
	int inch;
	int channel;
	boolean power;
	int volume;
	
	void volumeUp() {
		volume++;
	}
}

class Student extends Person{
	int stu_id;
	String stu_dept; //Com.Eng.	
}

public class learnStruct {
	public static void main(String[] args) {
	TV myLGtv = new TV();

	Person changJuPark = new Person();
	
	System.out.println(changJuPark);
	
	
	changJuPark.age = 23;
	changJuPark.height = 170;
	
	changJuPark.name = "changJuPark";
	changJuPark.setName("changJuPark");
	
	
	}
	
}
