package com.plethora.servercomms;

import java.io.*;
import java.net.*;

public class HTTPManager {

    public static String get(String url) {
        StringBuilder sb = new StringBuilder();
        try {
            URL u = new URL(url);
            URLConnection uc = u.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                sb.append(inputLine);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
    
}
