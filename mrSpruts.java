package Instances;

import Constructors.BerdlamMember;

public class mrSpruts extends BerdlamMember {

    public mrSpruts() {
    	name = "��.������";
        setStatusDubotolk(false);
    }


    @Override
    public String toString() {
        return "������������ �������� '" + getName() + "'";
    }

}