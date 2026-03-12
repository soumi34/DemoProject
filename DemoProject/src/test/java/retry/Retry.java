package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


//Retry class is used to re-execute the failed testcase.TestNg provide the IRetryAnalyzer interface

public class Retry implements IRetryAnalyzer{

 int counter = 0;
 int retrylimit =2;//count of reexecution
 
 public boolean retry(ITestResult  result)
 {
	 if(counter<retrylimit)
	 {
		 counter++;//reexecution
		 return true;
	 }
	 
	 return false;// stop execution
 }
	

}
