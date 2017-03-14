package nett.formacion.aaa.module4.characters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

public class PlayerCharacter {
	@Id private String id;
	
	private String name;
	private Races race;
	private Professions profession;
	
	private List <Skill> skills = new ArrayList <Skill>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Races getRace() {
		return race;
	}

	public void setRace(Races race) {
		this.race = race;
	}

	public Professions getProfession() {
		return profession;
	}

	public void setProfession(Professions profession) {
		this.profession = profession;
	}
	
	public void addSkill(Skill skill)
	{
		this.skills.add(skill);
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
}
