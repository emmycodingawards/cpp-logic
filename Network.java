public static void Network(int argc, char * argv[]) {
	try {
		if (argc != 3) {
			cerr << "Usage: " << argv[0] << " <host> <port>" << endl;
			return 1;
		}
		/*
				tcp::resolver::query query(argv[1], argv[2]);
				tcp::resolver::iterator endpoint_iterator = resolver.resolve(query);
				tcp::resolver::iterator end;

				tcp::socket socket(io_service);
				system::error_code error = asio::error::host_not_found;
				while (error && endpoint_iterator != end) {
					socket.close();
					socket.connect(*endpoint_iterator++, error);
				}
				if (error)
					throw system::system_error(error);

				while (true) {
					boost::array<char, 128> buf;
					system::error_code error;

					size_t len = socket.read_some(asio::buffer(buf), error);

					if (error == asio::error::eof)
						break; // Connection closed cleanly by peer.
					else if (error)
						throw system::system_error(error); // Some other error.

					cout.write(buf.data(), len);
				}
			} catch (std::exception& e) {
				cerr << e.what() << endl;
			}

			return 0;
		}nt main(int argc, char* argv[]) {
			try {
				if (argc != 3) {
					cerr << "Usage: " << argv[0] << " <host> <port>" << endl;
					return 1;
				}

				tcp::resolver::query query(argv[1], argv[2]);
				tcp::resolver::iterator endpoint_iterator = resolver.resolve(query);
				tcp::resolver::iterator end;

				tcp::socket socket(io_service);
				system::error_code error = asio::error::host_not_found;
				while (error && endpoint_iterator != end) {
					socket.close();
					socket.connect(*endpoint_iterator++, error);
				}
				if (error)
					throw system::system_error(error);

				while (true) {
					boost::array<char, 128> buf;
					system::error_code error;

					size_t len = socket.read_some(asio::buffer(buf), error);

					if (error == asio::error::eof)
						break; // Connection closed cleanly by peer.
					else if (error)
						throw system::system_error(error); // Some other error.

					cout.write(buf.data(), len);
				}
			} catch (std::exception& e) {
				cerr << e.what() << endl;
			}

			return 0;
		}
		*/

		string hostName = args[0];
		int portNumber = Integer.parseInt(args[1]);

		try (
			    Socket echoSocket = new Socket(hostName, portNumber);
			    PrintWriter out =
			        new PrintWriter(echoSocket.getOutputStream(), true);
			    BufferedReader in =
			        new BufferedReader(
			    new InputStreamReader(echoSocket.getInputStream()));
			    BufferedReader stdIn =
			        new BufferedReader(
			    new InputStreamReader(System.in))
			)
