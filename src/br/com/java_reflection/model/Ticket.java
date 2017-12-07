package br.com.java_reflection.model;

import java.math.BigDecimal;
import java.util.Date;


public class Ticket {
	
	private String code ;
	private String observation;
	private BigDecimal value;
	private String updatedObservation;
	private boolean halfValue ;
	private boolean sold;
	private Date dateSold;
	

	public Ticket() {
		// TODO Auto-generated constructor stub
	}
	
	//methods
	
	public boolean isHalfValue () {
		
		return this.halfValue;
	}
	
	
	public boolean isSold() {
		
		return this.sold;
		
	}
	
	//getters and setters 

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public String getUpdatedObservation() {
		return updatedObservation;
	}

	public void setUpdatedObservation(String updatedObservation) {
		this.updatedObservation = updatedObservation;
	}

	public Date getDateSold() {
		return dateSold;
	}

	public void setDateSold(Date dateSold) {
		this.dateSold = dateSold;
	}

	public void setHalfValue(boolean halfValue) {
		this.halfValue = halfValue;
	}

	public void setSold(boolean sold) {
		this.sold = sold;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((dateSold == null) ? 0 : dateSold.hashCode());
		result = prime * result + (halfValue ? 1231 : 1237);
		result = prime * result + ((observation == null) ? 0 : observation.hashCode());
		result = prime * result + (sold ? 1231 : 1237);
		result = prime * result + ((updatedObservation == null) ? 0 : updatedObservation.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (dateSold == null) {
			if (other.dateSold != null)
				return false;
		} else if (!dateSold.equals(other.dateSold))
			return false;
		if (halfValue != other.halfValue)
			return false;
		if (observation == null) {
			if (other.observation != null)
				return false;
		} else if (!observation.equals(other.observation))
			return false;
		if (sold != other.sold)
			return false;
		if (updatedObservation == null) {
			if (other.updatedObservation != null)
				return false;
		} else if (!updatedObservation.equals(other.updatedObservation))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ticket [code=" + code + ", observation=" + observation + ", value=" + value + ", updatedObservation="
				+ updatedObservation + ", halfValue=" + halfValue + ", sold=" + sold + ", dateSold=" + dateSold + "]";
	}
	
	
	
	
	
	

}
