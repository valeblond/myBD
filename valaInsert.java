import java.sql.*;

public class valaInsert {

	public static void main(String[] args) {
		 try { 
	            String url = "jdbc:msql://200.210.220.1:1114/Demo"; 
	            Connection conn = DriverManager.getConnection(url,"",""); 
	            Statement st = conn.createStatement(); 
	            st.executeUpdate("INSERT INTO bikeRaces " + 
	                "VALUES (1, 'Ground trail', 4, 242, 'webPage isnot created',90, 'Poznan')"); 
	            st.executeUpdate("INSERT INTO bikeRaces " + 
		            "VALUES (2, 'Kaszebe Velo', 3, 99, 'www.czasnarower.pl/',93, 'Gdynia')"); 
	            st.executeUpdate("INSERT INTO bikeRaces " + 
		            "VALUES (3, 'Round Center', 4, 31, 'www.rovercentrum.pl/',85, 'Wroclaw')");
	            conn.close(); 
	        } catch (Exception e) { 
	            System.err.println("Got an exception! "); 
	            System.err.println(e.getMessage()); 
	        } 
	}

}
