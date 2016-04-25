package com.lms.domain;

import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class ScheduleInfo {
	
	private String name;
	private String startDate;
	private String endDate;
	private String lastModified;
	private String created;
	private int duration;
	private String durationUnit;
	//private ScheduleLocationInfo location;
	private String typeId;
	private String typeURL;
	private String title;
	private String vendor;
	private String category;
	private String subcategory;
	private int price;
	private String currency;
	private String status;
	private String guaranteedCourse;
	private String lastMinute;
	private String earlyBookingPrice;
	private String self;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getLastModified() {
		return lastModified;
	}
	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getDurationUnit() {
		return durationUnit;
	}
	public void setDurationUnit(String durationUnit) {
		this.durationUnit = durationUnit;
	}
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getTypeURL() {
		return typeURL;
	}
	public void setTypeURL(String typeURL) {
		this.typeURL = typeURL;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGuaranteedCourse() {
		return guaranteedCourse;
	}
	public void setGuaranteedCourse(String guaranteedCourse) {
		this.guaranteedCourse = guaranteedCourse;
	}
	public String getLastMinute() {
		return lastMinute;
	}
	public void setLastMinute(String lastMinute) {
		this.lastMinute = lastMinute;
	}
	public String getEarlyBookingPrice() {
		return earlyBookingPrice;
	}
	public void setEarlyBookingPrice(String earlyBookingPrice) {
		this.earlyBookingPrice = earlyBookingPrice;
	}
	public String getSelf() {
		return self;
	}
	public void setSelf(String self) {
		this.self = self;
	}

	
	
//	private int jmwClassInfoId;
//	private String jmwName;
//	private int avnetTypeInfoId;
//	private String avnetTypeName;
//	private Date startDateTs;
//	private Date endDateTs;
//	private Timestamp lastModifiedTs;
//	private String lastModifiedBy;
//	private Timestamp createdTs;
//	private Date startDateLocalTs;
//	private Date endDateLocalTs;
//	private String publicPrivate;
//	private String classStatus;
//	private String gtr;
//	private int totalRegistered;
//	private int totalJmwRegistered;
//	private int instructorId;
//	private String instructorName;
//	private String ownedBy;
//	private String sourcedBy;
//	private int jmwLocationInfoId;
//	private int roomInfoId;
//	private String qryResultLocCode;
//	private String qryResultRoomCode;
//	private String notes;
//	private String po ="Not Assigned";
//	private String tech = "";
//	private String labs = "JM";
//	private String classroomDeliveryMethod;
//	private String lockPrice;

	
	
}
