package Instances;

import Constructors.BerdlamMember;

public class oMember extends BerdlamMember {


    public oMember() {
        name = "кто-то другой";
        setStatusDubotolk(false);
    }


    @Override
    public String toString() {
        return "Участник собрания '" + getName() + "'";
    }

}
