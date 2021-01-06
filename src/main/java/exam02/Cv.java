package exam02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cv {

    private String name;
    private List<Skill> skills;

    public Cv(String name, List<Skill> skills) {
        this.name = name;
        this.skills = skills;
    }

    public Cv(String name) {
        this.name = name;
        this.skills = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void addSkills(String... skills) {
        for(String s: skills){
            this.skills.add(returnSkill(s));
        }
    }

    public int findSkillLevelByName(String name){
      return this.skills.stream().filter(x->x.getName().equals(name)).findFirst().get().getLevel();
    }

    private Skill returnSkill(String v){
        String regex = "[a-zA-Z]+";
        String regex2 = "[0-9]+";
        String name = v;
        String level = v;
        name = name.replaceAll(regex,"");
        level = level.replaceAll(regex2,"");
        return new Skill(level,Integer.valueOf(name));


    }


}
