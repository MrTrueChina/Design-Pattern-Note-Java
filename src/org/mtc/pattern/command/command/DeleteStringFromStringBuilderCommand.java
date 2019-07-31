package org.mtc.pattern.command.command;

/**
 * 	从StringBuilder中删除字符串的命令
 */
public class DeleteStringFromStringBuilderCommand implements Command {

	private StringBuilder _stringBuilder;
	private int _length;
	/**
	 * 	被这个命令删除的字符串，用于撤销操作
	 */
	private String _deletedString;

	public DeleteStringFromStringBuilderCommand(StringBuilder stringBuilder, int length) {
		_stringBuilder = stringBuilder;
		_length = length;
	}

	@Override
	public void doCommand() {
		if (_deletedString == null)
			saveDeleteString();
		deDeleteString();
	}

	private void saveDeleteString() {
		_deletedString = _stringBuilder.substring(_stringBuilder.length() - _length); // 因为只传入了删除长度，因此删除命令需要自己保存删掉的字符串用于撤销操作
	}

	private void deDeleteString() {
		_stringBuilder.delete(_stringBuilder.length() - _length, _stringBuilder.length());
	}

	@Override
	public void undoCommand() {
		_stringBuilder.append(_deletedString);
	}
}
