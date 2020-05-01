import static org.junit.Assert.*;

import org.junit.*;

public class MovieTestClass {


	FilmFileReader testerClass = new FilmFileReader();
	private static final double DELTA = 1e-15;
	

	@Test
	public void testDisplayFilmName() {
		testerClass.openFile();
		testerClass.readFile();
		String result = testerClass.displayFilmName(2);
		assertEquals("T2 Trainspotting", result);
	}

	@Test
	public void testDisplayFilmRating() {
		testerClass.openFile();
		testerClass.readFile();
		String result = testerClass.displayFilmRating(2);
		assertEquals("18", result);
	}

	

	@Test
	public void testDisplayFilmImage() {
		testerClass.openFile();
		testerClass.readFile();
		String result = testerClass.displayFilmImage(2);
		assertEquals("T2Trainspotting.jpg",result);
	}
	
	@Test
	public void testDisplayFilmDate() {
		testerClass.openFile();
		testerClass.readFile();
		String result = testerClass.displayFilmDate(2);
		assertEquals("22/05/17",result);
	}


}
