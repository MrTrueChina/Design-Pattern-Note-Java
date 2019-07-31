package org.mtc.pattern.chain.recorder;

import org.mtc.pattern.chain.Info;

/**
 * 	重要操作的记录器
 */
public class ImportantOperationalRecorder extends InfoRecorder {

	private static final int IMPORTANT_LEVEL = 2000;

	@Override
	protected boolean recordable(Info info) {
		return info.getLevel() <= IMPORTANT_LEVEL;
	}

	@Override
	protected void doRecord(Info info) {

		System.out.println("重要操作记录器记录：[" + info.getMessage() + "]，记录到 [重要操作.log]");
	}
}
