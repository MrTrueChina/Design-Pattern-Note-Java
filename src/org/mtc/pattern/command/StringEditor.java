package org.mtc.pattern.command;

import org.mtc.pattern.command.command.AppendStringIntoStringBuilderCommand;
import org.mtc.pattern.command.command.DeleteStringFromStringBuilderCommand;

/**
 * 	字符串编辑器类，支持撤销和重做
 */
public class StringEditor {

	private StringBuilder _stringBuilder = new StringBuilder();
	private CommandController _commandController = new CommandController();

	/**
	 * 	在编辑中的字符串后面添加字符串
	 * @param string 要添加的字符串
	 */
	public void append(String string) {
		
		_commandController.doCommand(new AppendStringIntoStringBuilderCommand(_stringBuilder, string)); // 命令模式中命令发出者不处理命令，命令在其他地方处理

		System.out.println("添加字符串\"" + string + "\"，添加后字符串为\"" + toString() + "\"");
	}

	/**
	 * 	在编辑中的字符串后面删除指定数量的字符串
	 * @param length 要删除的字符串的长度
	 */
	public void delete(int length) {
		
		_commandController.doCommand(new DeleteStringFromStringBuilderCommand(_stringBuilder, length));

		System.out.println("删除长度为" + length + "的字符串，删除后字符串为\"" + toString() + "\"");
	}

	/**
	 * 	撤销上一步的操作
	 */
	public void undo() {
		
		boolean haveUndoCommand = _commandController.undoCommand();

		if (haveUndoCommand)
			System.out.println("撤销操作，撤销后字符串为\"" + toString() + "\"");
		else
			System.out.println("没有可以撤销的操作");
	}

	/**
	 * 	重做撤销的操作
	 */
	public void redo() {
		
		boolean haveRedoCommand = _commandController.redoCommand();

		if (haveRedoCommand)
			System.out.println("重做操作，重做后字符串为\"" + toString() + "\"");
		else
			System.out.println("没有可以重做的操作");
	}

	@Override
	public String toString() {
		return _stringBuilder.toString();
	}
}
