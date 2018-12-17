package fev.test;

import org.junit.Test;
import org.springframework.core.SimpleAliasRegistry;

import java.util.Arrays;

public class SimpleAliasRegistryTest {

	@Test
	public void simpledAliasTest(){
		SimpleAliasRegistry registry = new SimpleAliasRegistry();
		registry.registerAlias("Fev","Wang");
		registry.registerAlias("Fev","Wang");
		Arrays.toString(registry.getAliases("Fev"));
	}


}
