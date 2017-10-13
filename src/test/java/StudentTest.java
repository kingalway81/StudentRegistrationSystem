import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;

public class StudentTest {
	
	@Test
	public void testGetUsername() {
		Student kev = new Student("kev", 25, 112233, new Date(1992, 9, 5));
		assertEquals("kev25", kev.getUsername());
		
	}

}
