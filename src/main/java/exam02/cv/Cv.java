package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {

    /*
    CV
    Egy önéletrajzot reprezentáló osztályt kell létrehozni, melyben van egy név,
    valamint skillek (hogy mihez ért az illető).
    A skill egy névvel és egy számmal (szint) rendelkezik, utóbbi 1 - 5 között.

    Az önéletrajz a Cv osztály pár metódussal, a skill a Skill osztály.

    A skillek megadása a nevével, valamint a szintjével történik, pl. programming (5).

    A findSkillLevelByName() a skill neve alapján visszaadja annak szintjét.
     */


    private String name;

    private Skill skill;

    private List<String> skillList = new ArrayList<String>();

    public Cv(String name) {
        this.name = name;
    }

    public Cv(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }
/*
    public List<Skill> addSkills(Skill name){
        return skillList.add(name);
    }



    public int findSkillLevelByName(String name) {
        if (name.equals(name)) {

        }
    }

 */

    public String getName() {
        return name;
    }

    public Skill getSkill() {
        return skill;
    }


}