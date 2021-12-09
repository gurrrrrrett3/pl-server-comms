package com.plethora.servercomms;

public class ResponseManager {
    
    public boolean success;
    public String message;
    public String timestamp;
    public String ip;
    


   public ResponseManager(String response) {

    String[] responseArray = response.split(",");

    this.success = Boolean.parseBoolean(responseArray[0]);
    this.message = responseArray[1];
    this.timestamp = responseArray[2];
    this.ip = responseArray[3];

   }
        

   public String toString() {
        return "ResponseManager{" + "success=" + success + ", message=" + message + ", timestamp=" + timestamp + ", ip=" + ip + '}';
    }
    }

