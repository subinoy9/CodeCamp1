package ArrayCode;

import static org.junit.Assert.*;
import org.junit.Test;
public class DevArrayProgramTest {
	@Test
	public void SumPossibleTest() {
		DevArrayProgram obj = new DevArrayProgram();
		int res=obj.SumofArray(31);
		assertEquals(1,res);
	}
	@Test
	public void SumNotPossible() {
		DevArrayProgram obj = new DevArrayProgram();
		int res=obj.SumofArray(59);
		assertEquals(-1,res);
		
	}

}
