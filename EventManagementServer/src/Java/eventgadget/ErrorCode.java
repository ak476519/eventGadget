// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.7.2.
// **********************************************************************

package Java.eventgadget;

public enum ErrorCode {

	SUCCESS(200),
	USEREXIST(301001),
	PHONEEXIST(301002),
	PLANETEXIST(301003),
	USERPROPOSED(301005),
	EVENTEXIST(301006),
	RECORDEXIST(301007),
	USERNOTEXIST(404001),
	PLANETNOTEXIST(404002),
	EVENTNOTEXIST(404004),
	RECORDNOTEXIST(404006),
	SERVERERROR(500);

	private final int value;

	private ErrorCode(int value) {
		this.value = value;
	}

	public int value() {
		return this.value;
	}

	@Override
	public String toString() {
		return this.name() + ":" + this.value;
	}

	public static ErrorCode convert(int value) {
		for(ErrorCode v : values()) {
			if(v.value() == value) {
				return v;
			}
		}
		return null;
	}
}
