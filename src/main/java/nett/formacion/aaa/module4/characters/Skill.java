package nett.formacion.aaa.module4.characters;

public class Skill {
	
	private String skillName;
	private Integer skillValue;
	
	public Skill ()
	{
		super();
	}
	
	public Skill (String skillName, Integer skillValue)
	{
		this.skillName = skillName;
		this.skillValue = skillValue;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Integer getSkillValue() {
		return skillValue;
	}

	public void setSkillValue(Integer skillValue) {
		this.skillValue = skillValue;
	}
	
	
}
