package Instances;

import Constructors.BerdlamMember;

public class mrDube extends BerdlamMember {

    public mrDube() {
        name = "��.����";
        setStatusDubotolk(true);
    }

    @Override
    public String toString() {
        return "�������� �������� '" + getName() + "'";
    }

}
