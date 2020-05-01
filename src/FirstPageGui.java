import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;



public class FirstPageGui extends JFrame{

	// Declaring Integers
		public int comboIndex1;

	// Declaring JLabel For Main UI
	private JLabel lblCinemaTitle;
	private JLabel lblMovieSelection;
	//private JLabel lblGenre;
	//pivate JLabel lblCastandCrew;
	//private JLabel lblDirector;
	//private JLabel lblDescription;
	//private JLabel lblActualDescription;
	private JLabel lblImgPreview;
	private JLabel lblTicketHeading;
	private JLabel lblAgeRating;
	private JLabel lblActualAgeRating;
	private JLabel lblDateOfFilm;
	private JLabel lblActualDateOfFilm;
	private JLabel lblDirector;
	private JLabel lblGenre;
	private JLabel lblCastandCrew;
	private JLabel lblDescription;



	//private JLabel lblActualNoSeats;
	//private JLabel lblAdultTicket;
	//private JLabel lblChildTicket;
	//private JLabel lblActualAdultTicket;
	//private JLabel lblActualChildTicket;
	//private JLabel lblAdultQty;
	//private JLabel lblChildQty;
	//private JLabel lblTicketSubTtl;
	//private JLabel lblActualTicketSubTtl;
	//private JLabel lblSnacks_Drinks;
	//private JLabel lblSnacksQty;
	//private JLabel lblDrinksQty;
	//private JLabel lblSDSubTotal;
	//private JLabel lblActualSDSubTotal;
	//private JLabel lblTotalPrice;
	//private JLabel lblActualTotalPrice;
	//private JLabel lblCashOrCard;
	//private JLabel lblExtraServices;
	//private JLabel lblSeatType;
	//private JLabel lblWaiterService;
	private JLabel lblBackgroundPic;

	// Declaring JLabel for JPanel 2 - Aka Receipt
	//private JLabel lblReceiptTitle;
	//private JLabel lblMovieOrdered;
	//private JLabel lblActualMovieOrdered;
	private JLabel lblMovieImage;
	//private JLabel lblMovieTime;
	//private JLabel lblActualMovieTime;
	private JLabel lblActualDescription;
	private JLabel lblActualCastandCrew;
	private JLabel lblActualMovieRating;

	private JLabel lblActualDirector;
	private JLabel lblActualGenre;
	//private JLabel lblChildPrice;
	//private JLabel lblActualChildPrice;
	//private JLabel lblATicketQty;
	//private JLabel lblCTicketQty;
	//private JLabel lblSnackName;
	//private JLabel lblSnackQty;
	//private JLabel lblDrinkName;
	//private JLabel lblDrinkQty;
	//private JLabel lblMthdOfPayment;
	//private JLabel lblActualMtdPayment;
	//private JLabel lblTotalPaid;
	//private JLabel lblActualTotalPaid;
	//private JLabel lblActualDateOfShow;
	//private JLabel lblActualSeatType;
	//private JLabel lblActualWaiterService;





	// Declaring JComboBox's 
	private JComboBox<String> cmbMovies;
	//private JComboBox<String> cmbAdultTicket;
	//private JComboBox<String> cmbChildTicket;
	//private JComboBox<String> cmbSnacks;
	//private JComboBox<String> cmbSnacksQty;
	//private JComboBox<String> cmbDrinks;
	//private JComboBox<String> cmbDrinksQty;
	//private JComboBox<String> cmbSeatType;

	// Declaring JSeparator's
	private JSeparator first_Separator;
	private JSeparator second_Separator;
	private JSeparator third_Separator;
	private JSeparator fourth_Separator;
	private JSeparator fifth_Separator;

	// Declaring Radio Button's
	//private JRadioButton radioBtnCard;
	//private JRadioButton radioBtnCash;

	//Declaring Check Box's
	//private JCheckBox cbWaiterService;

	// Declaring Button's
	//private JButton btnOrderTickets;
	private JButton btnReturnMain;

	// Calling Reader Classes Which Read Data From Txt File And Store the Date Into An Array
	FilmFileReader movieFile = new FilmFileReader();
	//SnackFileReader snacksFile = new SnackFileReader();
	//DrinkFileReader drinksFile = new DrinkFileReader();

	// Create New JPanels For Different Data
	private JPanel firstPanel;
	private JPanel secondPanel;


	// Constructor Class which Call The Method Create Gui
	public FirstPageGui(){
		super("Movie Rating");
		setVisible(true);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(null);
		createGui();

	}
	
	// Method Which Builds The GUI
	public void createGui(){

		// Starts The File Reader Function For Movie/Snack/Drink - Then Data To Be Read:
		movieFile.openFile();
		movieFile.readFile();


		ButtonGroup radioGroup = new ButtonGroup();
		lblActualGenre = new JLabel();

		// Build JPanel size and properties
		secondPanel = new JPanel();
		secondPanel.setVisible(false);
		secondPanel.setSize(610, 504);
		secondPanel.setBackground(Color.DARK_GRAY);
		getContentPane().add(secondPanel);
		secondPanel.setLayout(null);

		firstPanel = new JPanel();
		firstPanel.setLocation(0, 0);
		firstPanel.setSize(613,540);
		getContentPane().add(firstPanel);
		firstPanel.setBackground(Color.LIGHT_GRAY);
		firstPanel.setLayout(null);

		JPanel thirdPanel = new JPanel();
		thirdPanel.setLocation(0, 0);
		getContentPane().add(thirdPanel);
		thirdPanel.setVisible(false);
		thirdPanel.setSize(417,235);
		thirdPanel.setBackground(Color.DARK_GRAY);
		thirdPanel.setLayout(null);

		lblMovieImage = new JLabel();
		lblActualMovieRating = new JLabel();


		// Label Initialization
		lblCinemaTitle = new JLabel();
		lblMovieSelection = new JLabel();
		lblMovieSelection.setForeground(Color.WHITE);
		lblGenre = new JLabel();
		lblActualGenre = new JLabel();
		lblActualGenre.setForeground(Color.BLACK);
		lblCastandCrew = new JLabel();
		lblActualCastandCrew = new JLabel();
		lblActualCastandCrew.setForeground(Color.BLACK);
		//lblActualDescription = new JLabel();
		lblImgPreview = new JLabel();
		lblTicketHeading = new JLabel();
		lblAgeRating = new JLabel();
		lblActualAgeRating = new JLabel();
		lblDescription = new JLabel();
		lblActualDescription = new JLabel();
		lblActualDescription.setForeground(Color.BLACK);
		lblDirector = new JLabel();
		lblActualDirector = new JLabel();
		lblActualDirector.setForeground(Color.BLACK);
		//lblNoSeats = new JLabel();
		//lblNoSeats.setForeground(Color.BLACK);
		//lblActualNoSeats = new JLabel();
		//lblActualAdultTicket = new JLabel();
		//lblActualChildTicket = new JLabel();
		lblDateOfFilm = new JLabel();
		lblDateOfFilm.setForeground(Color.BLACK);
		lblActualDateOfFilm = new JLabel();
		//lblAdultQty = new JLabel();
		//lblAdultQty.setForeground(Color.BLACK);
		//lblChildQty = new JLabel();
		//lblChildQty.setForeground(Color.BLACK);
		//lblTicketSubTtl = new JLabel();
		//lblTicketSubTtl.setForeground(Color.BLACK);
		//lblActualTicketSubTtl = new JLabel();
		//lblSnacks_Drinks = new JLabel();
		//lblSnacksQty = new JLabel();
		//lblSnacksQty.setForeground(Color.BLACK);
		//lblDrinksQty = new JLabel();
		//lblDrinksQty.setForeground(Color.BLACK);
		//lblSDSubTotal = new JLabel();
		//lblSDSubTotal.setForeground(Color.BLACK);
		//lblActualSDSubTotal = new JLabel();
		//lblTotalPrice = new JLabel();
		//lblTotalPrice.setForeground(Color.BLACK);
		//lblActualTotalPrice = new JLabel();
		//lblCashOrCard = new JLabel();
		//lblCashOrCard.setForeground(Color.BLACK);
		//lblExtraServices = new JLabel();
		//lblSeatType = new JLabel();
		//lblSeatType.setForeground(Color.BLACK);
		//lblWaiterService = new JLabel();
		//lblWaiterService.setForeground(Color.BLACK);
		lblBackgroundPic = new JLabel();
		lblBackgroundPic.setBackground(Color.GRAY);



		// ComboBox Initialisation
		cmbMovies = new JComboBox<String>();
		//cmbAdultTicket = new JComboBox<String>();
		//cmbChildTicket = new JComboBox<String>();
		//cmbSnacks = new JComboBox<String>();
		//cmbSnacksQty = new JComboBox<String>();
		//cmbDrinks = new JComboBox<String>();
		//cmbDrinksQty = new JComboBox<String>();
		//cmbSeatType = new JComboBox<String>();

		// Separator Initialisation
		first_Separator = new JSeparator();
		second_Separator = new JSeparator();
		third_Separator = new JSeparator();
		fourth_Separator = new JSeparator(SwingConstants.VERTICAL);
		fifth_Separator = new JSeparator();

		// Radio Button Initialisation
		//radioBtnCash = new JRadioButton();
		//radioBtnCash.setBackground(Color.GRAY);
		//radioBtnCard = new JRadioButton();
		//radioBtnCard.setBackground(Color.GRAY);
		//radioGroup.add(radioBtnCard);
		//radioGroup.add(radioBtnCash);

		// Button Initialisation

		// CheckBox's Initialisation
		//cbWaiterService = new JCheckBox();
		//cbWaiterService.setBackground(Color.GRAY);


		
		
		// Button Initialisation For Second JPanel
		btnReturnMain = new JButton();
		
		

		// Title Of The Program
		lblCinemaTitle.setFont(new Font("Times New Roman",Font.BOLD,18));
		lblCinemaTitle.setForeground(Color.WHITE);
		lblCinemaTitle.setText("Movie Rating");
		firstPanel.add(lblCinemaTitle);
		lblCinemaTitle.setBounds(170,15,309,30);

		// Movie Selection
		lblMovieSelection.setFont(new Font("Times New Roman",0,12));
		lblMovieSelection.setText("Select Movie:");
		firstPanel.add(lblMovieSelection);
		lblMovieSelection.setBounds(12,72,80,15);


		//Combo Box For Movie Selection
		cmbMovies.setModel(new DefaultComboBoxModel<String>(movieFile.displayAllFilms()));

		firstPanel.add(cmbMovies);
		cmbMovies.setBounds(93,67,214,25);


		// Listening For Any Events Coming From The Movie Combo Box
		cmbMovies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				comboIndex1 = cmbMovies.getSelectedIndex();
				System.out.println("inside action performed: " + comboIndex1);

				cmbMoviesActionPerformed(evt);
     			//lblMoviesTheatreActionPerformed(evt);
//				lblMoviesTimeActionPerformed(evt);
				lblMovieAgeRatingActionPerformed(evt);
//				lblNoSeatsActionPerformed(evt);
//				lblTicketPriceActionPerformed(evt);
//				lblDateOfMovieActionPerformed(evt);

			}
		});



		// Setting Up The Image Preview For When The Program First Runs
		lblImgPreview.setBounds(350,65,250,250);
		lblImgPreview.setVisible(true);
		lblImgPreview.setFont(new Font("Times New Roman", Font.ITALIC + Font.BOLD, 20));
		lblImgPreview.setText("SELECT A MOVIE");
		lblImgPreview.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgPreview.setVerticalAlignment(SwingConstants.CENTER);
		firstPanel.add(lblImgPreview);

		lblImgPreview.setBorder(BorderFactory.createEtchedBorder(Color.BLACK,Color.WHITE));

		// Age Rating Label & The Value It Will Display Depending On The Movie Selected
		lblAgeRating.setFont(new Font ("Times New Roman", Font.BOLD, 10));
		lblAgeRating.setForeground(Color.WHITE);
		lblAgeRating.setText("Age Rating: ");
		firstPanel.add(lblAgeRating);
		lblAgeRating.setBounds(433,314,110,15);

		lblActualAgeRating.setFont(new Font ("Times New Roman", Font.BOLD, 12));
		firstPanel.add(lblActualAgeRating);
		lblActualAgeRating.setBounds(503,314,110,15);

		// Heading With A Separator Between Movie And Genre Details
				lblGenre.setFont(new Font("Times New Roman",Font.BOLD,10));
				lblGenre.setForeground(Color.WHITE);
				lblGenre.setText("Genre");
				firstPanel.add(lblGenre);
				lblGenre.setBounds(18,99,110,15);

				firstPanel.add(first_Separator);
				first_Separator.setBounds(128,109,223,10);

				// Setting Up Cast and Crew Labels
				lblCastandCrew.setFont(new Font("Times New Roman",0,12));
				lblCastandCrew.setText("Cast and Crew"); 
				firstPanel.add(lblCastandCrew);
				lblCastandCrew.setBounds(18,120,80,15);

				lblActualCastandCrew.setFont(new Font("Times New Roman", Font.ITALIC,12));
				lblActualCastandCrew.setForeground(Color.WHITE);
				firstPanel.add(lblActualCastandCrew);
				lblActualCastandCrew.setBounds(108,118,230,20);

				// Description
				lblDescription.setFont(new Font("Times New Roman",0,12));
				lblDescription.setText("Description");
				firstPanel.add(lblDescription);
				lblDescription.setBounds(18,150,90,15);

				lblActualDescription.setFont(new Font("Times New Roman",Font.ITALIC,12));
				lblActualDescription.setForeground(Color.WHITE);
				firstPanel.add(lblActualDescription);
				lblActualDescription.setBounds(118,147,100,20);

		
		
		

		//Date Of Film
		lblDateOfFilm.setFont(new Font("Times New Roman",0,12));
		lblDateOfFilm.setText("Date Of Film:");
		firstPanel.add(lblDateOfFilm);
		lblDateOfFilm.setBounds(190,150,90,15);

		lblActualDateOfFilm.setFont(new Font("Times New Roman",Font.ITALIC,12));
		lblActualDateOfFilm.setForeground(Color.WHITE);
		firstPanel.add(lblActualDateOfFilm);
		lblActualDateOfFilm.setBounds(275,147,100,20);



		// Sets The Background For The Main Application In The First Panel
		lblBackgroundPic.setIcon(new ImageIcon(getClass().getResource("background.jpg")));
		firstPanel.add(lblBackgroundPic);
		lblBackgroundPic.setBounds(0,0,610,551);
		
		// Closes The File From The File Reader Class
		movieFile.closeFile();
		//snacksFile.closeFile();
		//drinksFile.closeFile();



	}


	/**
	 * When The ComboBox For The Movie Selection Is Changed From It's Current State It Will Change The Behaviour
	 * Of All Of Thes Elements Within The GUI
	 */
	private void cmbMoviesActionPerformed(ActionEvent evt) {
		System.out.println("inside cmbMoviesActionPerformed");

		lblImgPreview.setText("");
		
//		comboIndex1 = 0;
		// Displays The Image Of The Movie From The ComboBox Depending On The Film Selected
		for (int i=0; i < comboIndex1; i++){
			String name = movieFile.displayFilmImage(comboIndex1);
			System.out.println("fds: " + name);
			lblImgPreview.setIcon(new ImageIcon(getClass().getResource(name))); 
			lblDateOfFilm.setText(movieFile.displayFilmDate(comboIndex1));
		}

		// If ComboBox is 0 Resets Everything As 0 Is Not A Film
		if (comboIndex1 == 0){
			lblImgPreview.setIcon(new ImageIcon(getClass().getResource("")));
			lblImgPreview.setText("SELECT A MOVIE");
			
		// Any Other Changes Happen Reset The Values Of Most Of The Components On Screen
		}else{
			
		}

	}


	

	// Displays The Age Rating Of The Film Selected
	private void lblMovieAgeRatingActionPerformed(ActionEvent evt){
		String ratingF = movieFile.displayFilmRating(comboIndex1);
		lblActualAgeRating.setText(ratingF);

	}

	

	
	
	
	

	
	
	
	
	}





