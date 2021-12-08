package com.plethora.servercomms;

public class PingData {

  public int timestamp;
  public String ip;

  public PingData(int timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public String toString() {
    return String.format("(timestamp=%s, ip=%s)", timestamp, ip);
  }
}