package org.mtc.pattern.command.command;

/**
 * 	向StringBuilder中添加字符串的命令
 */
public class AppendStringIntoStringBuilderCommand implements Command {

	private StringBuilder _stringBuilder;
	private String _string;

	public AppendStringIntoStringBuilderCommand(StringBuilder stringBuilder, String string) {
		_stringBuilder = stringBuilder;
		_string = string;
	}

	@Override
	public void doCommand() {
		_stringBuilder.append(_string);
	}

	@Override
	public void undoCommand() {
		_stringBuilder.delete(_stringBuilder.length() - _string.length(), _stringBuilder.length()); // 撤销操作的原理就是删掉添加的字符串
	}
}
