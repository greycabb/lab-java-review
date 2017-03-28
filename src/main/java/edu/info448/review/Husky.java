package edu.info448.review;

public class Husky extends Dog implements Huggable {

    public Husky(string name) {
        this.name = name;
        super.breed = "Husky";
    }

    public void pullSled() {
        System.out.println("pulled sled");
    }

    public void bark() {
		System.out.println(this+" says: Woof!");
	}
}