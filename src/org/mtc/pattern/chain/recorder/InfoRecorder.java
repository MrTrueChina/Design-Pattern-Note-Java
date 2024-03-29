package org.mtc.pattern.chain.recorder;

import org.mtc.pattern.chain.Info;

/**
 * 	信息记录器的共同父类，为了一个记录器存下一个记录器的效果需要所有记录器都是同一个父级的子级
 */
public abstract class InfoRecorder {

	private InfoRecorder _next;

	public void setNext(InfoRecorder nextRecorder) {
		_next = nextRecorder;
	}

	public InfoRecorder getNext() {
		return _next;
	}

	/**
	 * 	记录信息<br/>
	 * 	注意这个方法是final的，因为这个方法负责决定请求是自己解决还是向后抛出，不可更改
	 * @param info
	 */
	public final void record(Info info) {
		
		if(recordable(info))
			doRecord(info);
		else
			passToNext(info);
	}

	protected abstract boolean recordable(Info info);

	protected abstract void doRecord(Info info);
	
	private void passToNext(Info info) {
		_next.record(info);
	}
}
