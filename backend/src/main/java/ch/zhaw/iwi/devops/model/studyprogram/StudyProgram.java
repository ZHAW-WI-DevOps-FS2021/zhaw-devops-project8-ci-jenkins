package ch.zhaw.iwi.devops.model.studyprogram;

import javax.persistence.Entity;

import ch.zhaw.iwi.devops.model.AbstractEntity;

@Entity
public class StudyProgram extends AbstractEntity implements Comparable<StudyProgram> {

	private String name;
	
	private String mvp;

	private String description;

	private String studiengang;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMvp(String mvp){
		this.mvp = mvp;
	}

	public String getMvp(){
		return mvp;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStudiengang() {
		return name;
	}

	public void setStudiengang(String studiengang) {
		this.studiengang = studiengang;
	}
	
	@Override
	public int compareTo(StudyProgram o) {
		return this.getName().compareTo(o.getName());
	}

}
