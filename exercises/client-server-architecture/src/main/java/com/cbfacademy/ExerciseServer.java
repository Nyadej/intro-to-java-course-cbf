package com.cbfacademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ExerciseServer {
    public static void main(String[] args) {
        try {
            // Create a server socket that listens on port 4040
            ServerSocket serverSocket = new ServerSocket(4040);
            System.out.println("Server listening on port 4040");

            // Wait for a client to connect
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected");

            // Use try-with-resources to automatically close the BufferedReader
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
                String message = reader.readLine();  // Read the message from the client
                System.out.println("Received message from client: " + message);
            }

            // Close the client socket
            clientSocket.close();

            // Close the server socket after use
            serverSocket.close();
        } catch (Exception e) {
            // Print any errors that occur
            e.printStackTrace();
        }
    }
}