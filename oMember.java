package Instances;

import Constructors.BerdlamMember;

public class oMember extends BerdlamMember {


    public oMember() {
        name = "���-�� ������";
        setStatusDubotolk(false);
    }


    @Override
    public String toString() {
        return "�������� �������� '" + getName() + "'";
    }

}
