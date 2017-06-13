package data;

import java.util.*;
import java.io.*;

public class President {
	private int termNumber;
	private String firstName;
	private String middleName;
	private String lastName;
	private int startYear;
	private int endYear;
	private String party;

	public President(int termNumber, String firstName, String middleName, String lastName, int startYear, int endYear,
			String party) {
		super();
		this.termNumber = termNumber;
		this.middleName = middleName;
		this.lastName = lastName;
		this.startYear = startYear;
		this.endYear = endYear;
		this.party = party;
	}

	public President() {
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("President [termNumber=");
		builder.append(termNumber);

		builder.append(", firstName=");
		builder.append(firstName);

		builder.append(", middleName=");
		builder.append(middleName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", startYear=");
		builder.append(startYear);
		builder.append(", endYear=");
		builder.append(endYear);
		builder.append(", party=");
		builder.append(party);
		builder.append("]");
		return builder.toString();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getTermNumber() {
		return termNumber;
	}

	public void setTermNumber(int termNumber) {
		this.termNumber = termNumber;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getStartYear() {
		return startYear;
	}

	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}

	public int getEndYear() {
		return endYear;
	}

	public void setEndYear(int endYear) {
		this.endYear = endYear;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

}
