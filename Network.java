import java.io.*;
import java.net.*;

public class Network
{
/*
//	public void sendScore()
//	Network client = new Network();
//	client.run();
*/
	//------------------------------------
	
	public void run(int x) throws Exception
	{
//		System.out.println("HELLO! TESTING!!!!!!");
		Socket SOCK = new Socket("localhost", 2021);
		PrintStream PS = new PrintStream(SOCK.getOutputStream());
		PS.println(x);

		InputStreamReader IR = new InputStreamReader(SOCK.getInputStream());
		BufferedReader BR = new BufferedReader(IR);

		String MESSAGE = BR.readLine();
		System.out.println(MESSAGE);



	}


























}
