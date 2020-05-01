import java.io.*;
import java.util.*;
public class FilmFileReader {
	// Scanner To Take Data From Text File
	private Scanner movieScan;
	
	// Creates Array 
	ArrayList<Film> movie = new ArrayList<Film>();
	String[]keyword = new String[8];
	// Initialization Of Variables
	String fName, fRating,fLocation, fDate;
	String fGenre,fCastandCrew, fDescription;
	String movieFile = "MovieList.txt";
	String line;
	Film shogun;
	
	// Opens Text File Which Contains The Movies
	public void openFile(){
		try{
			movieScan = new Scanner(new File(movieFile));
		}
		catch(Exception e){
			// Create Dialog Window To Print Error!
			System.out.printf("Could Not Find the File %s", movieFile);
		}
	}
	
	// Reads The Data Within The Text File And Splits Data After every ';'
	public void readFile(){
		while (movieScan.hasNextLine()){
			
			line = movieScan.nextLine();
			keyword = line.split("; ");
			fName = keyword[0];
			fRating = keyword[1];
			fGenre = keyword[2];
			fCastandCrew = keyword[3];
			fDescription = keyword[4];
			//fAdultTicket = Double.parseDouble(keyword[2]);
			//fChildTicket = Double.parseDouble(keyword[3]);
			//fCapacity = Integer.parseInt(keyword[4]);
			//fTheatreRoom = keyword[5];
			//fTime = keyword[6];
			fLocation = keyword[5];
			fDate = keyword[6];
			System.out.println("Location: " + fLocation);
			System.out.println("Date: " + fDate);
			
			shogun = new Film(fName, fRating, fGenre, fCastandCrew, fDescription, fLocation, fDate);
			movie.add(shogun);
		}
	}
	
	// Closes File 
	public void closeFile(){
		movieScan.close();
	}
	
	// Returns All The Films Stored In The Array
	public String[] displayAllFilms(){
		String[] toRet = new String[movie.size()];
		for (int i=0; i < movie.size(); i++){
			toRet[i] = movie.get(i).getFilm();
		}
		return toRet;
	}
	// Returns A Film Name Depending On Index Provided For The Array
	public String displayFilmName(int index){
		System.out.println("Asked film name for index" + index);
		return movie.get(index).getFilm();
	}
	// Returns A Film Rating Depending On Index Provided For The Array
	public String displayFilmRating(int index){
		return movie.get(index).getAgeRating();
	}
	
	// Returns A Film's Genre Depending On The Index
	public String displayGenre(int index){
		return movie.get(index).getGenre();
	}
	// Returns The Cast and Crew Depending On The Index
	public String displayCastandCrew(int index){
		return movie.get(index).getCastandCrew();
	}
	
	// Returns Description Depending On The Index
		public String displayDescription(int index){
			return movie.get(index).getDescription();
		}
		
	// Returns The Image Name For It To Be Used As A Path
		public String displayFilmImage(int index){
			return movie.get(index).getFilmAddress();
		}
	
	// Returns The Date In Which A Film Will Show Depending On The Index
	public String displayFilmDate(int index){
		return movie.get(index).getFilmDate();
	}
}

