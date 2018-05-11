import java.io.*;
import java.net.*;

public class Server
{
	public static void main(String[] args) throws Exception
	{
		Server svr = new Server();
		svr.run();
	}

	public void run() throws Exception
	{
		
		float number;
		
		ServerSocket SrvSock = new ServerSocket(2021);
		Socket Sock = SrvSock.accept();
		InputStreamReader IR = new InputStreamReader(Sock.getInputStream());
		BufferedReader BR = new BufferedReader(IR);

		String MESSAGE = BR.readLine();
		System.out.print("The quiz takers score is ");
		System.out.print(MESSAGE);
		System.out.println("/12");
		System.out.println("Shutting down server");
		number = Float.valueOf(MESSAGE);
		int x = (int)number;

		if(x > 8)
		{
			PrintStream PS = new PrintStream(Sock.getOutputStream());
			PS.println("Good work! Your passing grade has been sucessfully transmitted!");
		} else
		{

			PrintStream PS = new PrintStream(Sock.getOutputStream());
			PS.println("Results transmitted sucessfully; however, you did not receive a passing grade. Please review the topics listed above.");
		}
	}
}

