package test26.animal;


public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	public String toString() {
		return "난 강아지 : " + super.toString();
	}

}
