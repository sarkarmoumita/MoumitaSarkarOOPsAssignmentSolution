package com.greatlearning.department.Tech;
import com.greatlearning.department.superDepartment.superDepartment;
public class TechDepartment extends superDepartment {

	public String DepartmentName()
	{
			return "Tech Department";

	}
	public String getTodaysWork()
	{
		return "Complete coding of module 1";
	}
    public String getWorkDeadline()
    {
    	return "Complete by EOD";
    }
    public String getTechStackInformation()
    {
    	return "core Java";
    }
}