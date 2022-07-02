package com.greatlearning.department.Admin;
import com.greatlearning.department.superDepartment.superDepartment;
public class AdminDepartment extends superDepartment {

	public String DepartmentName()
	{
			return "Admin Department";

	}
	public String getTodaysWork()
	{
		return "Complete your documents Submission";
	}
    public String getWorkDeadline()
    {
    	return "Complete by EOD";
    }
}
