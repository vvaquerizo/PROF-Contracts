package es.upm.grise.prof2018.contracts.values;

import com.google.java.contract.Invariant;

@Invariant({"credits >= 1","credits <= 6"})
public enum CourseDataValues {
	
	GPTI 			("DEGREE", "Gestion de Procesos de Tecnologias de la Informacion", 4),
	PROFUNDIZACION	("MASTER", "Profundizacion en Ingeniería de Software", 3);
	
	private String level;
	private String name;
	private int credits;

	CourseDataValues(String level, String name, int credits) {
		this.level = level;
		this.name = name;
		this.credits = credits;
	}
	
	public String getLevel() {
		return level;
	}

	public String getName() {
		return name;
	}

	public int getCredits() {
		return credits;
	}

}
