package Instances;

import Constructors.SleepwalkerInterface;

public class Secretary implements SleepwalkerInterface {
    private String name;
    private boolean dubotolk;

    public Secretary() {
        name = "Секретарша";
        dubotolk = false;
    }

    public Secretary(String name) {
        this.name = name;
        this.dubotolk= false;
    }

    public void SendMeetingNotification() {
        System.out.println(name + " оповестила о необходимости явится на совещание.");
    }

    @Override
    public String getName() {
        return name;
    }

 
	@Override
	public boolean isDubotolk() {
		return dubotolk;
	}

	@Override
	public void setStatusDubotolk(boolean _dubotolk) {
		dubotolk = _dubotolk;
		
	}
	
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Secretary) {
            return name.equals(((Secretary) obj).getName()) && isDubotolk() == ((Secretary) obj).isDubotolk();
        }
        return false;
    }

    @Override
    public int hashCode() {
        if (isDubotolk()) return name.hashCode() + name.length();
        return name.hashCode();
    }
}
