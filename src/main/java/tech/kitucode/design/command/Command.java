package tech.kitucode.design.command;

public interface Command {
    void execute();

    void undo();
}
