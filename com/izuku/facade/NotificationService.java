package com.izuku.facade;

public class NotificationService {
    public void send(String message,String target){
      NotificationServer server=new NotificationServer();
      Connection connection=server.connect("ip");
      AuthToken authToken=server.authenticate("id", "key");
      server.send(authToken, new Message(message), target);
      connection.disconnect();
    }
}
