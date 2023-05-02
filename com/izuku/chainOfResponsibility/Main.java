package com.izuku.chainOfResponsibility;

public class Main {
  public static void main(String[] args) {
    HttpRequest request =new HttpRequest("izuku", "1234");
    Encryptor encryptor = new Encryptor(null);
    Compressor compressor = new Compressor(encryptor);
    Logger logger = new Logger(compressor);
    Authenticator authenticator =new Authenticator(logger);

    authenticator.handle(request);
  }
}
