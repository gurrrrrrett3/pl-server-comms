package com.plethora.servercomms;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.gson.JsonArray;

public class ResponseManager {
    
    public boolean success;
    public String message;
    public PingData pingData;
    
   Gson gson = new Gson();
   JsonParser parser = new JsonParser();

   public ResponseManager(String response) {

    System.out.println(parser.parse(response));

       JsonArray array = parser.parse(response).getAsJsonArray();
       success = gson.fromJson(array.get(0), Boolean.class);
       message = gson.fromJson(array.get(1), String.class);
       pingData = gson.fromJson(array.get(2), PingData.class);
    }
        

   public String toString() {
        return "ResponseManager{" + "success=" + success + ", message=" + message + ", timestamp=" + pingData.timestamp + '}';
    }
    }

