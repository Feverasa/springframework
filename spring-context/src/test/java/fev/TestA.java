package fev;

import org.junit.Test;

public class TestA {


	@Test
	public void messageResource(){

		try(Person person = new Person();){
			System.out.println("Hello");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
