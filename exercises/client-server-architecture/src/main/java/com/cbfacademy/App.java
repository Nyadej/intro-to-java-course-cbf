package com.cbfacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class App {
    public static void main(String[] args) {
    try {
        URL url = new URI("https://www.cbfacademy.com/").toURL(); // create a URL object with the website URL
        HttpURLConnection connection = (HttpURLConnection) url.openConnection(); // opening a connection to the website - ?FLAG
                                                                                // Open stream doesn't need a connection to be created, this is all done in the open stream method
            connection.setRequestMethod("GET"); // the action that I take when the connection is complete (GET//POST//UPDATE//DELE)
                                                        
        try { // open  connection to the URL
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream())) // create a BufferedReader to read the content from the URL
        {
            String line; {
            while ((line = reader.readLine()) !=null) { // read and print the content line by line until there are no more lines to read
                System.out.println(line); // prints each line to the screen
            }
        }
        } catch (IOException e) 