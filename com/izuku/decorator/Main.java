package com.izuku.decorator;

public class Main {
  public static void main(String[] args) {
    //Store plain data without decorating
    storeCreditCard(new CloudStream());
    System.out.println("without decor \n");

    //store encrypted text with decoration  encrpty
    storeCreditCard(new EncryptedCloudStream(new CloudStream()));
    System.out.println("with decor encrypt \n");

   //store encrypted text with decoration compress

    storeCreditCard(new CompressedCloudStream(new CloudStream()));
    System.out.println("with decor Compress \n");

    storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
    System.out.println("with decor Compress and encrypt \n");


  }
  public static void storeCreditCard(Stream stream) {
    stream.write("1234-1234-1234-1234");
  }
}
