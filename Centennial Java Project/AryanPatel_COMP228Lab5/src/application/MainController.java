package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;

public class MainController {

	@FXML
	private TextField playerFirstName;
	@FXML
	private TextField playerLastName;
	@FXML
	private TextField playerAddress;
	@FXML
	private TextField playerProvince;
	@FXML
	private TextField playerPostalCode;
	@FXML
	private TextField playerPhoneNumber;
	@FXML
	private TextField playerId;
	@FXML
	private Button updateInfo;
	@FXML
	private DatePicker gamePlayedDate;
	@FXML
	private TextField gameScore;
	@FXML
	private TextField gameTitle;
	@FXML
	private Button createPlayer;
	@FXML
	private Button displayPlayer;
	
	JFrame frame, frame1;
	static JTable table;
	
	// Event Listener on Button[#updateInfo].onAction
	@FXML
	public void handleButtonAction(ActionEvent event) throws SQLException {
		
		if(event.getSource() == createPlayer)
		{
			System.out.println("Adding record in Database !");
			insertRecord();
			System.out.println("Added record in Database Successfully !");
		}
		if(event.getSource() == displayPlayer)
		{
			displayRecord();
		}
		
		if(event.getSource() == updateInfo)
		{
			System.out.println("Updating record in Database !");
			updateRecord();
			System.out.println("Updated record in Database Successfully !");
		}
	}
	public static Connection getConnection()
	{
		Connection con;
		try {
			con  = DriverManager.getConnection("jdbc:oracle:thin:@199.212.26.208:1521/SQLD","COMP214_W22_zor_67","password");
			System.out.println("Database Connection Established");
			return con;
		}catch(Exception ex) {
			System.out.println("Error:" + ex.getMessage());
			return null;
		}
	}

	
	// Insert Record in Database
	private void insertRecord() throws SQLException{
		
		Connection conn = getConnection();
		
		// INSERT DATA IN PLAYER TABLE
		String playerGeneratedColumns[] = { "PLAYER_ID" };
		String query = "INSERT INTO player (FIRST_NAME,LAST_NAME,ADDRESS,POSTAL_CODE,PROVINCE,PHONE_NUMBER) VALUES(?,?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(query,playerGeneratedColumns);
		pstmt.setString(1,playerFirstName.getText());
		pstmt.setString(2,playerLastName.getText());
		pstmt.setString(3,playerAddress.getText());
		pstmt.setString(4,playerPostalCode.getText());
		pstmt.setString(5,playerProvince.getText());
		pstmt.setString(6,playerPhoneNumber.getText());
		pstmt.execute();
		ResultSet prs = pstmt.getGeneratedKeys();
		
		// INSERT DATA IN GAME TABLE
		String gameGeneratedColumns[] = { "GAME_ID" };
		String gameQuery = "INSERT INTO game (GAME_TITLE) VALUES(?)";
		PreparedStatement gpstmt = conn.prepareStatement(gameQuery, gameGeneratedColumns);
		gpstmt.setString(1, gameTitle.getText());
		gpstmt.execute();
		ResultSet grs = gpstmt.getGeneratedKeys();
		
		// INSERT DATA IN PLAYERANDGAME TABLE
		
		if(prs != null && prs.next()){
			if(grs != null && grs.next())
			{
				String pgQuery = "INSERT INTO playerandgame (GAME_ID,PLAYER_ID,PLAYING_DATE,SCORE) VALUES(?,?,?,?)";
				PreparedStatement pgpstmt = conn.prepareStatement(pgQuery);
				pgpstmt.setInt(1, grs.getInt(1));
				pgpstmt.setInt(2, prs.getInt(1));
				pgpstmt.setDate(3, Date.valueOf(gamePlayedDate.getValue()));
				pgpstmt.setString(4, gameScore.getText());
				pgpstmt.execute();
			}
		}
	}
	
	// Update Record in Database
	private void updateRecord() throws SQLException{
		
		Connection conn = getConnection();
		
		String pQuery = "UPDATE player SET first_name = ?, last_name = ?, address = ?, postal_code = ?, province = ?, phone_number = ? WHERE player_id =?";
		PreparedStatement statement = conn.prepareStatement(pQuery);
		
		statement.setString(1,playerFirstName.getText());
		statement.setString(2,playerLastName.getText());
		statement.setString(3,playerAddress.getText());
		statement.setString(4,playerPostalCode.getText());
		statement.setString(5,playerProvince.getText());
		statement.setString(6,playerPhoneNumber.getText());
		statement.setString(7, playerId.getText());
		
		int rowsUpdated = statement.executeUpdate();
		if (rowsUpdated > 0) {
		    System.out.println("An existing user was updated successfully!");
		}
	}
	
	// Display records from database
	private void displayRecord() throws SQLException{
		
		Connection conn = getConnection();
	    String columns[] = { "ID", "NAME", "ADDRESS", "POSTAL CODE", "PROVINCE", "PHONE NUMBER", "GAME TITLE", "SCORE", "DATE PLAYED"};
		String pattern = "MM/dd/yyyy";
		DateFormat df = new SimpleDateFormat(pattern);
		
	    frame1 = new JFrame("Player Information ");
	    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame1.setLayout(new BorderLayout());
	    
	    DefaultTableModel model = new DefaultTableModel();
	    model.setColumnIdentifiers(columns);
	    table = new JTable();
	    table.setModel(model); 
	    table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
	    table.setFillsViewportHeight(true);
	    JScrollPane scroll = new JScrollPane(table);
	    scroll.setHorizontalScrollBarPolicy(
	    JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	    scroll.setVerticalScrollBarPolicy(
	    JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
	    
	    
	    String pQuery = "SELECT p.player_id, p.first_name, p.address, p.postal_code, p.province, p.phone_number, g.game_title, pg.score, pg.playing_date FROM player p JOIN playerandgame pg ON p.player_id = pg.player_id JOIN game g  ON g.game_id = pg.game_id";

	    PreparedStatement ps = conn.prepareStatement(pQuery);
	    ResultSet pres = ps.executeQuery();
	    int i = 0;

	    while (pres.next()) {
	    	String player_id = pres.getString("PLAYER_ID");
	    	String first_name = pres.getString("FIRST_NAME");
	    	String address = pres.getString("ADDRESS");
	    	String postal_code = pres.getString("POSTAL_CODE");
	    	String province = pres.getString("PROVINCE");
	    	String phone_number = pres.getString("PHONE_NUMBER");
	    	String game_title = pres.getString("GAME_TITLE");
	    	int score = pres.getInt("SCORE");
	    	String playing_date = df.format(pres.getDate("PLAYING_DATE"));
	    	model.addRow(new Object[] {player_id, first_name, address, postal_code, province, phone_number, game_title, score, playing_date});
	    	i++;
	    }
	    if (i < 1) {

            JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);

        }

        if (i == 1) {

            System.out.println(i + " Record Found");

        } else {

            System.out.println(i + " Records Found");

        }
        frame1.add(scroll);
        frame1.setVisible(true);
        frame1.setSize(900, 400);
	}
}

