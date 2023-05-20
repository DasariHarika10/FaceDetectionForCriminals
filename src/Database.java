
public class Database {

	String username;
	String password;
	String host;
	String driver;

	public Database() {
		try {
			//java.io.FileInputStream datain = new java.io.FileInputStream(getClass().getResource("Images\\face.dat").getFile());
			//java.io.DataInputStream datadin = new java.io.DataInputStream(datain);
			java.io.DataInputStream datadin = new java.io.DataInputStream(getClass().getResource("Images\\face.dat").openStream());
			String line = "";
			username = datadin.readLine();
			password = datadin.readLine();
			host = datadin.readLine();
			driver = datadin.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Test {
	public static void main(String args[]) {
		Database d1 = new Database();
		System.out.println(d1.driver+" "+ d1.host + " " + d1.password + " " + d1.username);
	}
}