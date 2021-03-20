package Berdlams;

import Berdlams.Berdlam.SalaryMinException;

public interface BerdlamInterface {
	public static final int MIN_SALARY = 25;
	public String getBName();
	public void AddMember(String name);
	public void IsMember(boolean ISMember);
	public void SetPrice(int newPrice);
	public void SetSalary(int newSalary) throws SalaryMinException;
}
