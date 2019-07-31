package org.mtc.pattern.command;

import java.util.Stack;

import org.mtc.pattern.command.command.Command;

/**
 * 	命令控制器，控制命令的执行、撤销和重做
 */
public class CommandController {

	/**
	 * 	撤销命令栈
	 */
	private Stack<Command> _undoCommands = new Stack<Command>();
	/**
	 * 	重做命令栈
	 */
	private Stack<Command> _redoCommands = new Stack<Command>();

	/**
	 * 	执行命令
	 * @param command
	 */
	public void doCommand(Command command) {

		command.doCommand();

		_undoCommands.add(command);

		_redoCommands.clear(); // 执行命令后之前可以重做的命令就不能重做了，直接清空重做命令栈
	}

	/**
	 * 	撤销命令
	 * @return 如果有可以撤销的命令则返回true，否则返回false
	 */
	public boolean undoCommand() {

		if (!_undoCommands.isEmpty()) {
			doUndoCommand();
			return true;
		}
		
		return false;
	}

	private void doUndoCommand() {

		Command undoCommand = _undoCommands.pop();

		undoCommand.undoCommand();

		_redoCommands.push(undoCommand);
	}

	/**
	 * 	重做命令
	 * @return 如果有可以重做的命令，则返回true，否则返回false
	 */
	public boolean redoCommand() {

		if (!_redoCommands.isEmpty()) {
			doRedoCommand();
			return true;
		}
		
		return false;
	}

	private void doRedoCommand() {

		Command redoCommand = _redoCommands.pop();

		redoCommand.doCommand();

		_undoCommands.push(redoCommand);
	}
}
