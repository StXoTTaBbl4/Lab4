package Instances;

import Constructors.BerdlamMeetingAbstract;

public class BigMeeteng extends BerdlamMeetingAbstract{
 
    public BigMeeteng() {
    }
    
	@Override
	public String GetMeetingName() {
		return "Собрание большого бредлама";
	}
	
    @Override
    public void StartMeeteng() {
        System.out.println("Совещание '" + this.GetMeetingName() + "' началось за большим круглым столом.");
    }
    
    @Override
    public void EndMeeting() {
        System.out.println("Совещание '" + this.GetMeetingName() + "' окончено. Всем спасибо, все свободны!");
    }



   
}