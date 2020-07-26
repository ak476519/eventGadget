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
public class Column {

	@TarsStructProperty(order = 0, isRequire = true)
	public String columnName = "";
	@TarsStructProperty(order = 1, isRequire = true)
	public boolean DBInt = false;
	@TarsStructProperty(order = 2, isRequire = true)
	public String columnValue = "";

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public boolean isDBInt() {
		return DBInt;
	}

	public void setDBInt(boolean DBInt) {
		this.DBInt = DBInt;
	}

	public String getColumnValue() {
		return columnValue;
	}

	public void setColumnValue(String columnValue) {
		this.columnValue = columnValue;
	}

	public Column() {
	}

	public Column(String columnName, boolean DBInt, String columnValue) {
		this.columnName = columnName;
		this.DBInt = DBInt;
		this.columnValue = columnValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(columnName);
		result = prime * result + TarsUtil.hashCode(DBInt);
		result = prime * result + TarsUtil.hashCode(columnValue);
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
		if (!(obj instanceof Column)) {
			return false;
		}
		Column other = (Column) obj;
		return (
			TarsUtil.equals(columnName, other.columnName) &&
			TarsUtil.equals(DBInt, other.DBInt) &&
			TarsUtil.equals(columnValue, other.columnValue) 
		);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Column(");
		sb.append("columnName:");
		if (this.columnName == null) {
			sb.append("null");
		} else {
			sb.append(this.columnName);
		}
		sb.append(", ");
		sb.append("DBInt:");
		sb.append(this.DBInt);
		sb.append(", ");
		sb.append("columnValue:");
		if (this.columnValue == null) {
			sb.append("null");
		} else {
			sb.append(this.columnValue);
		}
		sb.append(")");
		return sb.toString();
	}

	public void writeTo(TarsOutputStream _os) {
		_os.write(columnName, 0);
		_os.write(DBInt, 1);
		_os.write(columnValue, 2);
	}


	public void readFrom(TarsInputStream _is) {
		this.columnName = _is.readString(0, true);
		this.DBInt = _is.read(DBInt, 1, true);
		this.columnValue = _is.readString(2, true);
	}

}
