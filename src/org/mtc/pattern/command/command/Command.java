package org.mtc.pattern.command.command;

/**
 * 	命令接口，所有命令的共同父级，命令模式的基础
 */
public interface Command {

	/**
	 * 	执行命令
	 */
	public void doCommand();

	/**
	 * 	撤销命令
	 */
	public void undoCommand();
}
