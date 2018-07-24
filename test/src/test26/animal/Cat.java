package test26.animal;

public class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}

	public String toString() {
		return "난 고양이 : " + super.toString();
	}
}
