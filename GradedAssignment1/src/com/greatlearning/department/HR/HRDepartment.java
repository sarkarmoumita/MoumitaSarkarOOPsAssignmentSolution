package com.greatlearning.department.HR;
import com.greatlearning.department.superDepartment.superDepartment;
public class HRDepartment extends superDepartment {

	public String DepartmentName()
	{
			return "HR Department";

	}
	public String getTodaysWork()
	{
		return "Fill today's worksheet and mark your attendance";
	}
    public String getWorkDeadline()
    {
    	return "Complete by EOD";
    }
    public String doActivity()
    {
    	return "team lunch";
    }
}