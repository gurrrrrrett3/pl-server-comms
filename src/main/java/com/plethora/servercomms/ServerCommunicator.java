package com.plethora.servercomms;

public class ServerCommunicator {

    private String serverIP;
    
    public ServerCommunicator(String serverIP) {
    
        this.serverIP = serverIP;

    }

    public void Heartbeat() {

        HTTPManager.get(serverIP + "/api/heartbeat");
    }

    public String get(String endpoint, String[][] query) {

        String url = generateURL(endpoint, query);

        return HTTPManager.get(url);
    }

    public String get(String endpoint) {

        String url = this.serverIP + endpoint;

        return HTTPManager.get(url);
    }

    public String getServerIP() {
        return serverIP;
    }

    

    public String generateURL(String endpoint, String[][] query) {

        String url = this.serverIP + endpoint;

        if (query != null) {

            url += "?";

            for (int i = 0; i < query.length; i++) {

                url += query[i][0] + "=" + query[i][1];

                if (i < query.length - 1) {

                    url += "&";

                }

            }

        }

        return url;

    }
}
