package org.mtc.pattern.command;

/*
 * 	命令模式（Command Pattern）：将请求的参数与执行封装到一个命令对象中，将请求者和执行者分离，也可用于辅助实现撤销和重做功能
 * 
 * 	命令模式将命令的发出和执行分离开来，这是一个看似没什么用实则意义重大的设计
 * 	这个分离使得命令可以脱离发出人自由发挥，并且给撤销和重做创造了巨大的空间来施展
 * 
 * 	我来写一个带撤销和重做的字符串编辑类的例子
 */
public class Main {
	public static void main(String[] args) {
		demo();
	}

	private static void demo() {

		StringEditor stringEditor = new StringEditor();

		stringEditor.append("Hello ");
		stringEditor.append("World");
		stringEditor.append("!");

		stringEditor.undo();
		stringEditor.undo();
		stringEditor.undo();
		stringEditor.undo(); // 前面只执行了三个命令，这第四个撤销会因为没有可撤销的操作而不起作用

		stringEditor.redo();
		stringEditor.redo();
		stringEditor.redo();
		stringEditor.redo(); // 前面只撤销了三个命令，所以这里的第四个重做也是没有作用的

		stringEditor.undo();
		stringEditor.delete(5); // 虽然前面有了撤销，但这一步执行命令导致了重做命令全部清空，因此后面是无法重做的

		stringEditor.redo();

		stringEditor.undo();
		stringEditor.undo();
	}
}
