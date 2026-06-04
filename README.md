# Simple Java Web Server

A foundational project exploring Java networking and socket programming by building a custom web server from scratch.

## 🚀 Overview
This project is a **single-threaded web server** implementation in Java. It demonstrates the core principles of networking, focusing on `ServerSocket`, input/output streams, and the basic request-response cycle. This serves as a starting point for deeper exploration into concurrent programming and scalable architecture.

## 🛠 Features
- **Custom Socket Implementation**: Binds to a specific port and listens for client connections.
- **Synchronous Handling**: Processes one client request at a time to clearly demonstrate the lifecycle of a socket connection.
- **Timeout Management**: Includes `soTimeout` functionality to prevent the server from hanging indefinitely.
- **Fundamental Networking**: Direct manipulation of `PrintWriter` and `BufferedReader` for data transmission.

## 📁 Project Structure
- `Server.java`: The server-side code that listens for incoming client connections.
- `Client.java`: A simulation client that initiates a request to the server.

## 📋 How It Works
1. The **Server** starts and binds to port `8018`.
2. The **Server** enters a `while(true)` loop, waiting for connections via `socket.accept()`.
3. The **Client** connects to `localhost:8018`.
4. The **Server** receives the connection, writes a response, and closes the stream.
5. If no connection is made within the configured `soTimeout` (10 seconds), the server throws a `SocketTimeoutException`.

## 📈 Learning Path: Next Steps
- [ ] Refactor to a **multi-threaded architecture** and thread pools.
- [ ] Implement handling for HTTP request methods (GET, POST).
- [ ] Add support for serving simple HTML files.

## 🤝 Credits & Inspiration
This project was built as part of my journey to understand Java backend internals without relying on high-level frameworks.

---
*Built with ❤️ in Java*
