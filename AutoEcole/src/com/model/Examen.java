package com.model;
// Generated 1 f�vr. 2015 11:00:11 by Hibernate Tools 3.4.0.CR1

/**
 * Examen generated by hbm2java
 */
public class Examen implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4094603695844178837L;
	private ExamenId id;
	private String typee;
	private String resultate;

	public Examen() {
	}

	public Examen(ExamenId id) {
		this.id = id;
	}

	public Examen(ExamenId id, String typee, String resultate) {
		this.id = id;
		this.typee = typee;
		this.resultate = resultate;
	}

	public ExamenId getId() {
		return this.id;
	}

	public void setId(ExamenId id) {
		this.id = id;
	}

	public String getTypee() {
		return this.typee;
	}

	public void setTypee(String typee) {
		this.typee = typee;
	}

	public String getResultate() {
		return this.resultate;
	}

	public void setResultate(String resultate) {
		this.resultate = resultate;
	}

}