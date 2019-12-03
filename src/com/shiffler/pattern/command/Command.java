/**
 * This defines our interface for a command. All the command user needs to do is to call the execute method to
 * make whatever the command does happen. If the command needs to be undone that can be executed as well by
 * calling the undo() method.
 */

package com.shiffler.pattern.command;

public interface Command {

    void execute();
    void undo();
}
