package Instances;

import Constructors.BerdlamMeetingAbstract;

public class BigMeeteng extends BerdlamMeetingAbstract{
 
    public BigMeeteng() {
    }
    
	@Override
	public String GetMeetingName() {
		return "�������� �������� ��������";
	}
	
    @Override
    public void StartMeeteng() {
        System.out.println("��������� '" + this.GetMeetingName() + "' �������� �� ������� ������� ������.");
    }
    
    @Override
    public void EndMeeting() {
        System.out.println("��������� '" + this.GetMeetingName() + "' ��������. ���� �������, ��� ��������!");
    }



   
}