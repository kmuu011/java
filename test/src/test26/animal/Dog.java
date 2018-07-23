package test26.animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	public String toString() {
		return "난 강아지 : " + super.toString();
	}

}
