package org.mtc.pattern.chain.recorder;

import org.mtc.pattern.chain.Info;

/**
 * 	不重要操作的记录器
 */
public class UnimportantOperationalRecorder extends InfoRecorder {

	/**
	 * 	这个记录器的记录等级，每个记录器只记录不超过自己等级的记录
	 */
	private static final int UNIMPORTANT_LEVEL = 0;

	@Override
	protected boolean recordable(Info info) {
		return info.getLevel() <= UNIMPORTANT_LEVEL;
	}

	@Override
	protected void doRecord(Info info) {

		// 真的输出到文件还要写IO老麻烦了，输出到控制台表示一下样子
		System.out.println("不重要操作记录器记录：[" + info.getMessage() + "]，记录到 [不重要操作.log]");
	}
}
