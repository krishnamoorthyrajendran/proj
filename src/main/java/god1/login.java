package god1;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

public interface login {
	
	
	public void function();
	public void login1();
	public void click();
	public static void main(String[] args) {
		ArrayList<Integer> name= new ArrayList<Integer> ();
		name.add(2);
		name.add(3);

		name.add(1);

		name.add(12);

		name.add(21);
		name.add(12);

		name.add(21);
		System.out.println(name);
		System.out.println(name.size());
		System.out.println(name.add(100));
		System.out.println(name);
		System.out.println(name.set(0, 55));
		System.out.println(name.clone());
		name.stream().distinct().forEach(a->System.out.println(a));
		name.add(21);
		System.out.println(name);
		System.out.println(name.size());
		System.out.println(name.add(100));
		System.out.println(name);
		System.out.println(name.set(0, 55));
		System.out.println(name.clone());
		name.stream().distinct().forEach(a->System.out.println(a));
}
