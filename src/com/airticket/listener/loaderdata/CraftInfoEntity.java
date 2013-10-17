package com.airticket.listener.loaderdata;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

/**
 * 飞机信息
 * 
 * @author jujian
 * 
 */
@XStreamAlias("CraftInfoEntity")
public class CraftInfoEntity implements Serializable{
	
	@XStreamOmitField
	private static final long serialVersionUID = -5060975490136540832L;
	// 机型代码
	@XStreamAlias("CraftType")
	private String craftType="";
	// 机型中文名称
	@XStreamAlias("CraftTypeName")
	private String craftTypeName="";
	// 宽度等级
	@XStreamAlias("WidthLevel")
	private String widthLevel="";
	// 最少座位数
	@XStreamAlias("MinSeats")
	private String minSeats="";
	// 最多座位数
	@XStreamAlias("MaxSeats")
	private String maxSeats="";
	// 备注
	@XStreamAlias("Note")
	private String note="";
//	// 机型英文名称
//	@XStreamAlias("Crafttype_ename")
//	private String crafttype_ename="";
	// 飞机大小分类
	@XStreamAlias("CraftKind")
	private String craftKind="";
	
	/**
	 * 机型代码
	 * @return
	 */
	public String getCraftType() {
		return craftType;
	}
	/**
	 * 机型代码
	 * @param craftType
	 */
	public void setCraftType(String craftType) {
		this.craftType = craftType;
	}
	/**
	 * 机型中文名称
	 * @return
	 */
	public String getCraftTypeName() {
		return craftTypeName;
	}
	/**
	 * 机型中文名称	
	 * @param cTName
	 */
	public void setCraftTypeName(String craftTypeName) {
		this.craftTypeName = craftTypeName;
	}
	/**
	 * 宽度等级
	 * @return
	 */
	public String getWidthLevel() {
		return widthLevel;
	}
	/**
	 * 宽度等级
	 * @param widthLevel
	 */
	public void setWidthLevel(String widthLevel) {
		this.widthLevel = widthLevel;
	}
	/**
	 * 最少座位数
	 * @return
	 */
	public String getMinSeats() {
		return minSeats;
	}
	/**
	 * 最少座位数
	 * @param minSeats
	 */
	public void setMinSeats(String minSeats) {
		this.minSeats = minSeats;
	}
	/**
	 * 最多座位数
	 * @return
	 */
	public String getMaxSeats() {
		return maxSeats;
	}
	/**
	 * 最多座位数
	 * @param maxSeats
	 */
	public void setMaxSeats(String maxSeats) {
		this.maxSeats = maxSeats;
	}
	/**
	 * 备注
	 * @return
	 */
	public String getNote() {
		return note;
	}
	/**
	 * 备注
	 * @param note
	 */
	public void setNote(String note) {
		this.note = note;
	}
//	/**
//	 * 机型英文名称
//	 * @return
//	 */
//	public String getCrafttype_ename() {
//		return crafttype_ename;
//	}
//	/**
//	 * 机型英文名称
//	 * @param crafttype_ename
//	 */
//	public void setCrafttype_ename(String crafttype_ename) {
//		this.crafttype_ename = crafttype_ename;
//	}
	/**
	 * 飞机大小分类
	 * @return
	 */
	public String getCraftKind() {
		return craftKind;
	}
	/**
	 * 飞机大小分类
	 * @param craftKind
	 */
	public void setCraftKind(String craftKind) {
		this.craftKind = craftKind;
	}
	
}
