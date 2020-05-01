
public class Film {
	
	// Variables For Film Attributes
	private String filmName;
	
	private String ageRating;
	private String filmAddress;
	private String genre;
	private String castandcrew;
	private String description;

	private String filmDate;
	
	// Constructor Which Takes Films Attributes
	public Film(String film, String age, String genreoffilm, String castoffilm, String story,  String filmLocation,  String dateOfFilm){
		
		filmName = film;
		
		ageRating = age;
		filmAddress = filmLocation;
		genre = genreoffilm;
		castandcrew = castoffilm;
		description = story;

		filmDate = dateOfFilm;
		
	}
	
	// Returns  Film Name
	public String getFilm(){
		return filmName;
	}
	
	
	// Returns Age Rating For Film
	public String getAgeRating(){
		return ageRating;
		}
	
	// Returns The Image Location For The Film Selected
	public String getFilmAddress(){
		return filmAddress;
	}
	
	// Returns Genre For Film
		public String getGenre(){
			return genre;
		}
		// Returns Cast and Crew
		public String getCastandCrew(){
			return castandcrew;
		}
		// Returns The Description For The Film Selected
		public String getDescription(){
			return description;
		}
	
	// Returns The Date Of The Film Selected
	public String getFilmDate(){
		return filmDate;
	}

}





