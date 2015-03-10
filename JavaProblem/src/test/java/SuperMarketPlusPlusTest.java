import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;


public class SuperMarketPlusPlusTest {

	@Test
	public void testTheTruth() {
		SuperMarketPlusPlus.main(null);
		List<Item> list=SuperMarketPlusPlus.getListItems();//Just to check the values
		//("Thermal Vest", 10, 20)
		assertTrue((list.get(0).getSellIn()==5) && (list.get(0).getQuality()==15));
		//("Aged Brie", 2, 0)	
		assertTrue((list.get(1).getSellIn()==-3) && (list.get(1).getQuality()==8));
		//("Chicken", 5, 7)
		assertTrue((list.get(2).getSellIn()==0) && (list.get(2).getQuality()==2));
		//("Sulfuras", 0, 80)
		assertTrue((list.get(3).getSellIn()==0) && (list.get(3).getQuality()==80));
		//("Backstage Passes", 15, 20)
		assertTrue((list.get(4).getSellIn()==10) && (list.get(4).getQuality()==25));
		//("Ginger Cake", 3, 6)
		assertTrue((list.get(5).getSellIn()==-2) && (list.get(5).getQuality()==0));
		//("Organic Bananas", 20, 40)
		assertTrue((list.get(6).getSellIn()==15) && (list.get(6).getQuality()==30));
	}
}
