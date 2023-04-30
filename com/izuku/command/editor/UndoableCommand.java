package com.izuku.command.editor;

public interface UndoableCommand extends Command{
    void unexecute();
}
