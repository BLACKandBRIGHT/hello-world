package team.redrock.skills;

import team.redrock.base.CureSkill;
import team.redrock.base.DamageSkill;
import team.redrock.base.buff.Dizzy;

/**
 * @Description
 * @Author 余歌
 * @Date 2018/10/31
 **/
public class Uzi extends CureSkill implements Dizzy {

    private static final String NAME = "枯木回春";
    private static final int CURE = 300;

    private static final int DIZZY_TIME = 2;
    public Uzi() {
        super(NAME, CURE);
    }

    @Override
    public int getTime(){
       return DIZZY_TIME;}}


