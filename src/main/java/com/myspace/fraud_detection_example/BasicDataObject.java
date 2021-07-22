package com.myspace.fraud_detection_example;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class BasicDataObject implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String transactionId;

	private java.lang.String fieldtwo;

	private java.lang.String dateField;

	private java.util.Date fieldthree;

	private java.time.LocalDateTime fieldfour;

	private java.lang.Integer amount;

	private java.time.LocalDateTime dateTime;

	public BasicDataObject() {
	}

	public java.lang.String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(java.lang.String transactionId) {
		this.transactionId = transactionId;
	}

	public java.lang.String getFieldtwo() {
		return this.fieldtwo;
	}

	public void setFieldtwo(java.lang.String fieldtwo) {
		this.fieldtwo = fieldtwo;
	}

	public java.lang.String getDateField() {
		return this.dateField;
	}

	public void setDateField(java.lang.String dateField) {
		this.dateField = dateField;
	}

	public java.util.Date getFieldthree() {
		return this.fieldthree;
	}

	public void setFieldthree(java.util.Date fieldthree) {
		this.fieldthree = fieldthree;
	}

	public java.time.LocalDateTime getFieldfour() {
		return this.fieldfour;
	}

	public void setFieldfour(java.time.LocalDateTime fieldfour) {
		this.fieldfour = fieldfour;
	}

	public java.lang.Integer getAmount() {
		return this.amount;
	}

	public void setAmount(java.lang.Integer amount) {
		this.amount = amount;
	}

	public java.time.LocalDateTime getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(java.time.LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public BasicDataObject(java.lang.String transactionId,
			java.lang.String fieldtwo, java.lang.String dateField,
			java.util.Date fieldthree, java.time.LocalDateTime fieldfour,
			java.lang.Integer amount, java.time.LocalDateTime dateTime) {
		this.transactionId = transactionId;
		this.fieldtwo = fieldtwo;
		this.dateField = dateField;
		this.fieldthree = fieldthree;
		this.fieldfour = fieldfour;
		this.amount = amount;
		this.dateTime = dateTime;
	}

}