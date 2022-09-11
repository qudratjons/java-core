package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class HttpRequest {
    public static void main(String[] args) {
        WConsoleBanner.writeOnTheConsole();

        try {
            BufferedReader bufferedReader;
            String line;
            StringBuffer response = new StringBuffer();

            URL url = new URL("https://jsonplaceholder.typicode.com/albums");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            //if it is error
            if (connection.getResponseCode() > 299) {
                bufferedReader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                for (int i = 0; i <= 9; i++) {
                    line = bufferedReader.readLine();
                    response.append(line).append("\n");
                }
                System.out.println(response);
            }

            // 200 success
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            for (int i = 0; i <= 501; i++) {
                line = bufferedReader.readLine();
                response.append(line).append("\n");
            }
            System.out.println(response);

        }catch (Exception e) {
            System.err.println("Error");
        }
    }
}


