package com.izuku.command;

import java.util.ArrayList;
import java.util.List;

import com.izuku.command.fx.Command;

public class CompositeCommand implements Command {
  private List<Command> commands= new ArrayList<>();

  public void add(Command command){
    commands.add(command);
  }

  @Override
  public void execute() {
    // Replay all commands
    for (Command command : commands) {
      command.execute();
    }
  }

}
