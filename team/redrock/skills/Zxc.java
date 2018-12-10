package team.redrock.skills;

import team.redrock.base.DamageSkill;
import team.redrock.base.buff.Dizzy;

/**
 * @Description
 * @Author 余歌
 * @Date 2018/10/31
 **/
public class Zxc extends DamageSkill implements Dizzy {

    private static final String NAME = "降龙十八掌";
    private static final int DAMAGE = 400;
    private static final int DIZZY_TIME = 1;

    public Zxc() {
        super(NAME, DAMAGE);
    }

    @Override
    public int getTime() {
        return DIZZY_TIME;
    }

}