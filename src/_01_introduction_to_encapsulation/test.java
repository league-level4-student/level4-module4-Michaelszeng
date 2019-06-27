package _01_introduction_to_encapsulation;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class test {
	EncapsulateTheData e = new EncapsulateTheData();
	
	@Test
	public void testGettersAndSetters() {
		e.setItemsReceived(-1);
		assertEquals(0, e.getItemsReceived());
		e.setItemsReceived(31);
		assertEquals(31, e.getItemsReceived());
		e.setDegreesTurned((float) 27.6);
		if (e.getDegreesTurned() - 27.6 > 0.00001) {
			fail();
		}
		e.setDegreesTurned((float) -5.6);
		if (e.getDegreesTurned() - 27.6 > 0.00001) {
			fail();
		}
		e.setNomenclature("");
		assertEquals(" ", e.getNomenclature());
		e.setNomenclature("george");
		assertEquals("george", e.getNomenclature());
		e.setMemberObj((Integer) 7);
		System.out.println(e.getMemberObj());
		System.out.println(e.getMemberObj() instanceof Integer);
		assertEquals((Integer) 7, e.getMemberObj());
		e.setMemberObj("cat");
		if  (!(e.getMemberObj() instanceof Object)) {
			fail();
		}
	}
}
