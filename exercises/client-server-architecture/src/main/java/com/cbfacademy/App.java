package com.cbfacademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class App {
    public static void main(String[] args) {
        String urlString = "https://codingblackfemales.com/";

        try {
            // Create a URI object from the string
            URI uri = new URI(urlString);
            
            // Convert the URI to a URL
            URL url = uri.toURL();
            
            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Use try-with-resources to automatically close the BufferedReader
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                
                // Read each line from the website and print it
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            // Print any errors that occur
            e.printStackTrace();
        }
    }
}