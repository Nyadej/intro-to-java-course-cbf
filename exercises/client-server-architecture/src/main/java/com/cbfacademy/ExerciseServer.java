package com.cbfacademy;

public class ExerciseServer {
    public static void main(String[] args) {
            
        try {
            try (ServerSocket serverSocket = new ServerSocket(4040)) { // create a ServerSocket object to listen for connections on localhost:4040
                System.out.println("Server listening on port 4040");
    
                Socket clienSocket = serverSocket.accept(); // accepting a connection from a client
            
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // Create BufferedReader for reading clien't messages
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true)

    
