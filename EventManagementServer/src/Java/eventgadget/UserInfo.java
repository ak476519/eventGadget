// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.7.2.
// **********************************************************************

package Java.eventgadget;

import com.qq.tars.protocol.util.*;
import com.qq.tars.protocol.annotation.*;
import com.qq.tars.protocol.tars.*;
import com.qq.tars.protocol.tars.annotation.*;

@TarsStruct
public class UserInfo {

	@TarsStructProperty(order = 0, isRequire = true)
	public String name = "";
	@TarsStructProperty(order = 1, isRequire = true)
	public String phone = "";
	@TarsStructProperty(order = 2, isRequire = true)
	public String gender = "";
	@TarsStructProperty(order = 3, isRequire = true)
	public String avatar_url = "";
	@TarsStructProperty(order = 4, isRequire = true)
	public String registration_time = "";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAvatar_url() {
		return avatar_url;
	}

	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}

	public String getRegistration_time() {
		return registration_time;
	}

	public void setRegistration_time(String registration_time) {
		this.registration_time = registration_time;
	}

	public UserInfo() {
	}

	public UserInfo(String name, String phone, String gender, String avatar_url, String registration_time) {
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.avatar_url = avatar_url;
		this.registration_time = registration_time;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(name);
		result = prime * result + TarsUtil.hashCode(phone);
		result = prime * result + TarsUtil.hashCode(gender);
		result = prime * result + TarsUtil.hashCode(avatar_url);
		result = prime * result + TarsUtil.hashCode(registration_time);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof UserInfo)) {
			return false;
		}
		UserInfo other = (UserInfo) obj;
		return (
			TarsUtil.equals(name, other.name) &&
			TarsUtil.equals(phone, other.phone) &&
			TarsUtil.equals(gender, other.gender) &&
			TarsUtil.equals(avatar_url, other.avatar_url) &&
			TarsUtil.equals(registration_time, other.registration_time) 
		);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("UserInfo(");
		sb.append("name:");
		if (this.name == null) {
			sb.append("null");
		} else {
			sb.append(this.name);
		}
		sb.append(", ");
		sb.append("phone:");
		if (this.phone == null) {
			sb.append("null");
		} else {
			sb.append(this.phone);
		}
		sb.append(", ");
		sb.append("gender:");
		if (this.gender == null) {
			sb.append("null");
		} else {
			sb.append(this.gender);
		}
		sb.append(", ");
		sb.append("avatar_url:");
		if (this.avatar_url == null) {
			sb.append("null");
		} else {
			sb.append(this.avatar_url);
		}
		sb.append(", ");
		sb.append("registration_time:");
		if (this.registration_time == null) {
			sb.append("null");
		} else {
			sb.append(this.registration_time);
		}
		sb.append(")");
		return sb.toString();
	}

	public void writeTo(TarsOutputStream _os) {
		_os.write(name, 0);
		_os.write(phone, 1);
		_os.write(gender, 2);
		_os.write(avatar_url, 3);
		_os.write(registration_time, 4);
	}


	public void readFrom(TarsInputStream _is) {
		this.name = _is.readString(0, true);
		this.phone = _is.readString(1, true);
		this.gender = _is.readString(2, true);
		this.avatar_url = _is.readString(3, true);
		this.registration_time = _is.readString(4, true);
	}

}
