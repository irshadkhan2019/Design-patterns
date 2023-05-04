package com.izuku.decorator;

public class EncryptedCloudStream implements Stream{
  private Stream stream;
  

  public EncryptedCloudStream(Stream stream) {
    this.stream = stream;
  }

  @Override
  public void write(String data) {
    String encrypted= encrypt(data);
    System.out.println("Encryption done calling"+stream);
    stream.write(encrypted);
  }

  private String encrypt(String data) {
    return "!@#$(!@#*()*)(*!@#";
  }
  
}
