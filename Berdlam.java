package Berdlams;


public class Berdlam implements BerdlamInterface {

	protected String Bname;


	public String getBName() {
		return Bname;
	}
	
	public void AddMember(String name) {}
	
	public void IsMember(boolean ISMember) {}

	public void SetPrice(int newPrice) {
		System.out.println(getBName()+" ��������� ����� ����: "+ newPrice + " ���������.");
	}

	public void SetSalary(int newSalary) throws SalaryMinException {
	
		if (newSalary<MIN_SALARY)
		{
			throw new SalaryMinException(getBName()+" ��������� ���������� ��������: "+ newSalary + " ���������. ��� ���� ������������ ��������, �������� ����!");
		}
		
		System.out.println(getBName()+" ��������� ��������: "+ newSalary + " ���������.");
	}


	public class SalaryMinException extends Exception {

		private static final long serialVersionUID = 1L;

		public SalaryMinException(String message) {
		       super(message);
		   }
		}
	
	public static class MinSalary{
		
		public static int getMinSAlary() {
			return MIN_SALARY;
		}
	}
	
	
}