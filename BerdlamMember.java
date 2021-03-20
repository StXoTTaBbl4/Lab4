package Constructors;


public class BerdlamMember implements BerdlamMemberInterface {
	protected String name;
    private boolean dubotolk;
    

	
    @Override
    public String getName() {
        return name + (isDubotolk()? "(Дуботолк)" :"");
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
	public void DoAction(BerdlamMeberAction _actionType) {
        switch (_actionType) {
        case MEETING_PARTICIPATE:
            System.out.println(getName() + " присоединился к собранию за большим круглым столом.");
            break;
        case SPECH:
            System.out.println(getName() + " взял слово.");
            break;
        case WORRY:
            System.out.println(getName() + " волнуется.");
            break;
        case JOIN_OFFER:
            System.out.println(getName() + " присоединился к предложению.");
            break;
        }
		
	}

	@Override
	public void SendMessageToMembers(String SpechText) {
       System.out.println(getName() + " сделал сообщение: '" + SpechText +"'");
 	}
	
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof BerdlamMember) {
            return name.equals(((BerdlamMember) obj).getName()) && isDubotolk() == ((BerdlamMember) obj).isDubotolk();
        }
        return false;
    }

    @Override
    public int hashCode() {
        if (isDubotolk()) return name.hashCode() + name.length();
        return name.hashCode();
        
    }
    
}
