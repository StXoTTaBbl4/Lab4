package Classes;

public class Loc {

	static String End = "�����";
	 
	public void EndMeeting() {
		class Locals{
			String OfMeeting = " ��������.";
			void Print() {
				System.out.println();
				System.out.print(End);
				System.out.print(OfMeeting);
			}
			
		}
		
		Locals local = new Locals();
        local.Print();
		
	}
	
	
	
}