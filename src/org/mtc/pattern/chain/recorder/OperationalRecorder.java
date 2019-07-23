package org.mtc.pattern.chain.recorder;

import org.mtc.pattern.chain.Info;

/**
 * 	操作记录器，外部在使用时访问的类
 */
public class OperationalRecorder {

	private static InfoRecorder _recorder;

	// 使用静态代码块进行初始化，通过一个接一个的存入下一个记录器来形成链
	static {
		UnimportantOperationalRecorder unimportantOperationalRecorder = new UnimportantOperationalRecorder();
		NormalOperationalRecorder normalOperationalRecorder = new NormalOperationalRecorder();
		ImportantOperationalRecorder importantOperationalRecorder = new ImportantOperationalRecorder();
		AccidentOperationalRecorder accidentOperationalRecorder = new AccidentOperationalRecorder();

		_recorder = unimportantOperationalRecorder;
		unimportantOperationalRecorder.setNext(normalOperationalRecorder);
		normalOperationalRecorder.setNext(importantOperationalRecorder);
		importantOperationalRecorder.setNext(accidentOperationalRecorder);
	}

	/**
	 * 	记录操作记录
	 * @param info 操作记录
	 */
	public static void record(Info info) {
		_recorder.record(info);
	}
}
