package com.plethora.servercomms;

public class test {

    public static void a(String[] args) {
     
        ServerCommunicator sc = new ServerCommunicator("http://localhost");

        String code = sc.get("/api/comms/");

        System.out.println(code);

        String[][] out = {{"code", code}, {"request", "shop"}, {"frame", "0"}, {"username", "Gucci_Garrett"}, {"balance", "1750"}};

        String res = sc.get("/api/comms/get", out);

       System.out.println(res);

    }

    public static void main(String[] args) {

         ServerCommunicator sc = new ServerCommunicator("http://localhost");

         String res = sc.get("/api/string/ping");
 
         ResponseManager rm = new ResponseManager(res);
         
        System.out.println("Response: " + rm.toString());
    }
    
}
