package com.plethora.servercomms;

public class test {

    public static void main(String[] args) {
     
        ServerCommunicator sc = new ServerCommunicator("http://localhost");

        String code = sc.get("/api/comms/");

        System.out.println(code);

        String[][] out = {{"code", code}, {"request", "shop"}, {"frame", "0"}, {"username", "test"}, {"balance", "300"}};

        String res = sc.get("/api/comms/get", out);

       System.out.println(res);

    }
    
}
