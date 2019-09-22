package dateFormatConcepts;

import java.time.LocalDate;

import org.testng.annotations.Test;

public class Date_Demo1 {

	@Test
	public void test(){
		
		LocalDate date = LocalDate.now().plusDays(2);
		
		System.out.println(date);
	}
	
}
