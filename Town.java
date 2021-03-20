package Town;

import java.util.*;
import Constructors.*;
import Instances.*;
import Berdlams.*;
import Berdlams.Berdlam.SalaryMinException;
import Classes.*;

public class Town {
	
	
	class Bredlams{
		List<BerdlamInterface> _ListOfBredlams = new ArrayList<BerdlamInterface>();
		Carbonic _Carbonic = new Carbonic();
        Cheesy _Cheesy = new Cheesy();
        Sugar _Sugar = new Sugar();
		
		public Bredlams() {
			_ListOfBredlams.add(_Carbonic);
			_ListOfBredlams.add(_Sugar);
			_ListOfBredlams.add(_Cheesy);
        }
		
		public List<BerdlamInterface> ListOfBredlams(){
			return _ListOfBredlams;
		}
	}
	
    private static void AllMeetengMemberDoAction(BerdlamMeberAction action, Iterator<BerdlamMemberInterface> iterator) {
        while(iterator.hasNext()){
        	BerdlamMemberInterface n = iterator.next();
            n.DoAction(action);
        }
     }   
   
     private static void AllBerdlamSetSalary(int newSalary, Iterator<BerdlamInterface> iteratorr) {
         while(iteratorr.hasNext()){
            BerdlamInterface h = (BerdlamInterface) iteratorr.next();
            try {
            		((Berdlam) h).SetSalary(newSalary);
            } catch (SalaryMinException e) {
                System.out.println(e.getMessage());
            }
        }          
     }
 
    
            
	public static void main(String[] args) {

		
        BigMeeteng _meeteng = new BigMeeteng();

        Secretary _sectretary = new Secretary();
        mrSpruts _mrSpruts = new mrSpruts();
        mrDube _mrDube = new mrDube();
        oMember _oMember = new oMember();
        
        List <BerdlamMemberInterface> _meetingMembers = new ArrayList<BerdlamMemberInterface>();
        _meetingMembers.add(_mrSpruts);
        _meetingMembers.add(_mrDube);
        _meetingMembers.add(_oMember);
        
        Town.Bredlams br= new Town().new Bredlams();
        
   try {
            System.out.println("Список Бредламов:");
	        for(BerdlamInterface mm : br.ListOfBredlams()) {
	            System.out.println("   -" + mm);
	        }
	        System.out.println();
	        
	        br._Carbonic.SetPrice(15);
	        System.out.println();
	        br._Cheesy.SetPrice(10);
	        System.out.println();
	        br._Sugar.SetPrice(5);
	        System.out.println();
	        
	        AllBerdlamSetSalary(20, br.ListOfBredlams().iterator());
	        System.out.println();
	
	        Berdlam.MinSalary ms = new Berdlam.MinSalary();
	        
	        AllBerdlamSetSalary(ms.getMinSAlary(), br.ListOfBredlams().iterator());
	        System.out.println();
	
	        
	        System.out.println("Список членов большого Бредлама:");
	        for(BerdlamMemberInterface mm : _meetingMembers) {
	            System.out.println("   -" + mm);
	        }
	        System.out.println();
	        
	        _sectretary.SendMeetingNotification();
	        _meeteng.StartMeeteng();
	        System.out.println();
	        
	        AllMeetengMemberDoAction(BerdlamMeberAction.MEETING_PARTICIPATE, _meetingMembers.iterator());
	        System.out.println();
	        
	        _mrSpruts.DoAction(BerdlamMeberAction.SPECH);
	        _mrSpruts.SendMessageToMembers("Нам грозит беда в связи с появлением гигантских растений!");
	        AllMeetengMemberDoAction(BerdlamMeberAction.WORRY, _meetingMembers.iterator());
	 
	        _mrSpruts.SendMessageToMembers("Все дело с гигантскими растениями необходимо убить в зародыше");
	        AllMeetengMemberDoAction(BerdlamMeberAction.JOIN_OFFER, _meetingMembers.iterator());
	
	        _mrDube.DoAction(BerdlamMeberAction.SPECH);
	        _mrDube.SendMessageToMembers("У меня имеются две очень способные и даже талантливые личности, которые могут взяться за это дельце.");
	 

	        Loc End2 = new Loc();
	        End2.EndMeeting();
	        
	        uwu AltEnding = new uwu() {
	   	 	public void uwu(){
	   			System.out.println();
	   			System.out.print("Alternative Ending");
	   			System.out.println();
	   		}
	        };	
	        AltEnding.uwu();
	   	
	        //System.out.println(360/0);
        
		}	catch (ArithmeticException e) {
			System.out.println();
		       System.out.println("ой, возникла ошибка! Нельзя делить на ноль! ");
	
	    } 
	}
}
