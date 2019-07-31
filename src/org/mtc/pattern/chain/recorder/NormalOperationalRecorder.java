package org.mtc.pattern.chain.recorder;

import org.mtc.pattern.chain.Info;

/**
 * 	普通操作的记录器
 */
public class NormalOperationalRecorder extends InfoRecorder {

	/**
	 * 	这个记录器的等级<br/>
	 * 	从不重要操作记录到普通操作记录有1000的跨度，主要是防止以后要在不重要和普通之间加等级，int的范围允许我们这样做冗余空间
	 */
	private static final int NORMAL_LEVEL = 1000;

	@Override
	protected boolean recordable(Info info) {
		return info.getLevel() <= NORMAL_LEVEL;
	}

	@Override
	protected void doRecord(Info info) {

		System.out.println("普通操作记录器记录：[" + info.getMessage()+"]，记录到 [普通操作.log]");
	}
}
