import java.util.*;
import java.io.*;
import java.util.*;
import java.net.*;

public class ChatServer
{
	public static void main(String[] args) throws Exception {		
			
			int PORT = 12345;
			String MACHINE = "localhost";
				try(
					ServerSocket ss = new ServerSocket(PORT);
					Socket s = ss.accept();
					Scanner sc = new Scanner(s.getInputStream());
					PrintWriter pw = new PrintWriter(s.getOutputStream());

				){
					while(true){
						Thread broadcast = new Thread(() -> {
							while(true){
								pw.println(sc.nextLine());
								pw.flush();
							}
						});

						//telnet.start();
						broadcast.start();

						//telnet.join(); // ha nincs join akkor hibaüzenet jön a scannerre, mert akkor a try block vége van ott, azaz az erőforrásokat felszabadítjuk és kirúgjuk a scannert
						broadcast.join();
					}
				}

	}
}