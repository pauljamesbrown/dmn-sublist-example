package com.myspace.fraud_detection_example;

import java.util.Date;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Transaction implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("transactionId")
	private java.lang.Integer transactionId;
	@org.kie.api.definition.type.Label("dateTime")
	private Date dateTime;
	@org.kie.api.definition.type.Label("location")
	private java.lang.String location;
	@org.kie.api.definition.type.Label(value = "transactionAmount")
	private java.math.BigDecimal transactionAmount;

	public Transaction() {
	}

	public java.lang.Integer getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(java.lang.Integer transactionId) {
		this.transactionId = transactionId;
	}

	public java.lang.String getLocation() {
		return this.location;
	}

	public void setLocation(java.lang.String location) {
		this.location = location;
	}

	public java.util.Date getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(java.util.Date dateTime) {
		this.dateTime = dateTime;
	}

	public java.math.BigDecimal getTransactionAmount() {
		return this.transactionAmount;
	}

	public void setTransactionAmount(java.math.BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public Transaction(java.lang.Integer transactionId,
			java.util.Date dateTime, java.lang.String location,
			java.math.BigDecimal transactionAmount) {
		this.transactionId = transactionId;
		this.dateTime = dateTime;
		this.location = location;
		this.transactionAmount = transactionAmount;
	}

}