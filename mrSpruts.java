package Instances;

import Constructors.BerdlamMember;

public class mrSpruts extends BerdlamMember {

    public mrSpruts() {
    	name = "гн.Спрутс";
        setStatusDubotolk(false);
    }


    @Override
    public String toString() {
        return "Председатель собрания '" + getName() + "'";
    }

}
