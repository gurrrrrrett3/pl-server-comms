package com.plethora.servercomms;

public class ResponseData {

    public boolean success;
    public String message;
    public PingData pingData;

    public ResponseData(boolean success, String message, PingData pingData) {
        this.success = success;
        this.message = message;
        this.pingData = pingData;
    }
    
}
