package com.example.laboratorycue.model;

public enum TypeDocument {
	CC("Citizenship card"), FI("Foreigner ID"), NPI("Number of personal identification"),TIN("Tax identification number"),IC("Identity card"),PA("Passport");

	private String typeDocument;

	TypeDocument(String typeDocument) {
		this.typeDocument = typeDocument;
	}

	public String getTypeDocument() {
		return typeDocument;
	}

	public void setTypeDocument(String typeDocument) {
		this.typeDocument = typeDocument;
	}
}
