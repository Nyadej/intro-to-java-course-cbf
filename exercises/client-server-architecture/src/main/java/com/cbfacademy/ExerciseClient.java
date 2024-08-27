package com.cbfacademy;

import java.io.PrintWriter;
import java.net.Socket;

public class ExerciseClient {
    public static void main(String[] args) {
        try {
            // Connect to the server on localhost at port 4040
            Socket socket = new Socket("localhost", 4040);
            System.out.println("Connected to server");

            // Use try-with-resources to automatically close the PrintWriter
            try (PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {
                writer.println("Hello, Server!");  // Send a message to the server
            }

            // Close the socket after use
            socket.close();
        } catch (Exception e) {
            // Print any errors that occur
            e.printStackTrace();
        }
    }
}

