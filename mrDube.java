package Instances;

import Constructors.BerdlamMember;

public class mrDube extends BerdlamMember {

    public mrDube() {
        name = "гн.Дубе";
        setStatusDubotolk(true);
    }

    @Override
    public String toString() {
        return "Участник собрания '" + getName() + "'";
    }

}
