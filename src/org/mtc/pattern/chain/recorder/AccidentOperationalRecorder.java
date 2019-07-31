package org.mtc.pattern.chain.recorder;

import org.mtc.pattern.chain.Info;

/**
 * 	意外操作的记录器，用于处理其他操作记录器都处理不了的记录
 */
public class AccidentOperationalRecorder extends InfoRecorder {

	@Override
	protected boolean recordable(Info info) {
		return true; // 这个记录器在最后兜底，所以什么记录都视为能处理
	}

	@Override
	protected void doRecord(Info info) {

		System.out.println("意外操作记录器记录：[" + info.getMessage() + "]，记录到 [意外操作.log]");
		System.out.println("发送异常操作信息到维护端：异常操作！" + info.getMessage()); // 用一个输出表示发送信息给运维
	}
}
