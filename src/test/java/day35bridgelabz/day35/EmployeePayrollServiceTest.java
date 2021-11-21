package day35bridgelabz.day35;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import static org.junit.Assert.*;

public class EmployeePayrollServiceTest {
    @Test
    public void givenEmployeePayrollInDB_WhenRetrieved_ShouldMatchEmployeeCount(){
        EmployeePayrollService employeePayrollService=new EmployeePayrollService();
        List<EmployeeInfo> employeeInfo =employeePayrollService.employee.retrieveData();
        Assert.assertEquals(7, employeeInfo.size());
    }

}