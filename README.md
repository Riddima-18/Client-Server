Client-Server

A simple Java TCP socket-based Client-Server application demonstrating basic network communication using Java's Socket and ServerSocket classes.

📁 Project Structure
Client-Server/
├── Client.java      # TCP client implementation
├── Server.java      # TCP server implementation
└── .gitattributes
🚀 Features
TCP socket communication between a client and a server
Server listens for incoming client connections
Client connects to the server and exchanges messages
Demonstrates core Java networking concepts (java.net, java.io)
🛠️ Requirements
Java Development Kit (JDK) 8 or higher
A terminal / command prompt
▶️ How to Run
Clone the repository
bash
   git clone https://github.com/Riddima-18/Client-Server.git
   cd Client-Server
Compile the source files
bash
   javac Server.java Client.java
Start the server (in one terminal window)
bash
   java Server
Start the client (in a separate terminal window)
bash
   java Client
Once both are running, they'll establish a connection and you can begin exchanging messages/data as implemented.
📌 Notes
Make sure the server is started before the client, so the client has something to connect to.
If running on different machines, update the server's IP address/hostname in Client.java and ensure the port used is open/allowed through any firewall.
📄 License

This project currently has no license specified. Feel free to add one (e.g., MIT) if you plan to share or open-source it.
