package team.redrock.heros;
import team.redrock.base.DamageSkill;
import team.redrock.base.Hero;
import team.redrock.base.Skill;
import team.redrock.skills.Bachi;import team.redrock.base.DamageSkill;
import team.redrock.base.Hero;
import team.redrock.base.Skill;
import team.redrock.skills.Bachi;
import team.redrock.skills.Uzi;
import team.redrock.skills.Zxc;

public class 余烬 extends Hero {
    private final static String NAME = "骚白";//你的名字
    private final static String STUID = "123456";//学号
    private final static int STR = 100;//力量
    private final static int INT = 200;//智力
    private final static int AGI = 200;//敏捷

    public 余烬 () {
        //在构造方法里第一行写上调用父类的构造方法
        //第一个参数是你的名字，第二个是学号，后面依次是力量、敏捷、智力。
        super(NAME, STUID, STR, AGI, INT);
        //自己搞两个技能
        Skill shadowRaze = new DamageSkill("吞噬", 50);
        Skill Uzi = new Uzi();

        super.addSkill(Uzi);
        super.addSkill(shadowRaze);

    }

}


