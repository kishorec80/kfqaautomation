package common;

public class Webelements {

	// Login Page Web Elements
	public static final String kfloginpage_usernameid = "emailId";
	public static final String kfloginpage_passwordid = "passwd";
	public static final String kfloginpage_loginxpath = "submitButton";

	public static final String appsxpath = "//*[@id='nav-mobile']/li[2]/a/span";
	public static final String createappspath = "/html/body/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div/p";
	public static final String nameoftheapppath = "//*[@id='form']/div[3]/div[3]/a";
	//For Reports
	public static final String reportsxpath = "//*[@id='nav-mobile']/li[3]/a/span";
	//For Admin
	public static final String adminxpath = "//*[@id='nav-mobile']/li[4]/a/span";
	//For Masters
	public static final String mastersxpath = "//*[@id='nav-mobile']/li[5]/a/span";
	//For Home
	public static final String homepath = "//*[@id='nav-mobile']/li[1]/a/span";
	public static final String homeiniateicon = "//*[@id='inbox-container']/div[3]/div/div[3]/a/i";
	public static final String homesearchicon = "//*[@id='initRequest']/div/div[1]/div[1]/div[1]/i";
	public static final String homesearchinput = "//*[@id='initRequest']/div/div[1]/div[1]/div[1]/input";
	public static final String homeinitate = "//*[@id='initRequest']/div/div[2]/ul/li/div[2]/button/span";
	public static final String homedrafts = "//*[@id='inbox-container']/ng-include[1]/div/div/section[2]/ul[2]/li[2]/a/div[1]";
	public static final String homeapprovals = "//*[@id='inbox-container']/ng-include[1]/div/div/section[2]/ul[1]/li[2]/a/div[1]/i";
	public static final String homereject = "//*[@id='inbox-container']/ng-include[1]/div/div/section[2]/ul[2]/li[5]/a/div[1]/i";
	public static final String homeinputrequest = "//*[@id='inbox-container']/ng-include[1]/div/div/section[2]/ul[1]/li[3]/a/div[1]/i";
	public static final String homemenuexpand = "//*[@id='inbox-container']/ng-include[1]/div/div/section[1]/div[1]/i";
	public static final String homemenuapproved="//*[@id='inbox-container']/ng-include[1]/div/div/section[2]/ul[2]/li[4]/a/div[1]/i";
	//For Form pages
	public static final String formreject = "//*[@id='form-container']/ng-include/div/ng-include[2]/div[1]/a[3]";
	public static final String formrestart = "//*[@id='form-container']/ng-include/div/ng-include[2]/div[1]/a[2]";
	public static final String formdelete = "//*[@id='form-container']/ng-include/div/ng-include[2]/div[1]/a[4]";
	public static final String formsubmit ="//*[@id='form-container']/ng-include/div/ng-include[2]/div[1]/a[2]";
	public static final String formapprove ="//*[@id='form-container']/ng-include/div/ng-include[2]/div[1]/a[2]";
																	
							
	//For Pop UP confirm delete
	public static final String popupconfirmdeleteyes = "//*[@id='deleteModal']/div[2]/a[2]";
	
	
	//For the Employee Onboarding
	public static final String employeeonboardingname = "//*[@id='Ce75f3a39a_198e_11e6_a50a_22000ae43382']";
	public static final String employeeonboardingpostion = "//*[@id='Ce75f63876_198e_11e6_a50a_22000ae43382']";
	public static final String employeeonboardingdepartment = "//*[@id='Ce75fe4f20_198e_11e6_a50a_22000ae43382']";
	public static final String employeeonboardingmanager = "//*[@id='Ce75f8cfa0_198e_11e6_a50a_22000ae43382']/div[1]/input";
	public static final String employeeonboardingdate = "//*[@id='Ce76039872_198e_11e6_a50a_22000ae43382']";
	public static final String employeeonboardingcurrentdate = "//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[7]/a";
	public static final String employeeonboardingsave = "//*[@id='editor-controller']/div/ng-include/div/ng-include[2]/div[1]/a[3]/span[1]";
	public static final String employeeonboardingdraftform = "//*[@id='editor-controller']/ng-include/div/ul/li[2]/div/div[2]/div[2]/mark";
	public static final String employeeonboardingsubmitform = "//*[@id='form-container']/ng-include/div/ng-include[2]/div[1]/a[2]";
	
	//For the 'Testing 'app in the Live Apps 
	public static final String testingname = "//*[@id='Cec7b6dea8_1bf1_11e6_a50a_22000ae43382']";
	public static final String testingdepartment = "//*[@id='Cedf80918c_1bf1_11e6_a50a_22000ae43382']";
	public static final String testingsubmit = "//*[@id='editor-controller']/div/ng-include/div/ng-include[2]/div[1]/a[2]";
	public static final String testinginputrequest = "//*[@id='inbox-container']/ng-include[1]/div/div/section[2]/ul[1]/li[3]/a/div[1]/i";
	public static final String testingform = "//*[@id='editor-controller']/ng-include/div/ul/li[2]/div/div[2]/div[2]";
	public static final String testingcomment = "comment";
	public static final String testinggetclarity = "//*[@id='form-container']/ng-include/div/ng-include[2]/div[1]/a[4]/span";
	public static final String testinggetclarifications = "//*[@id='inbox-container']/ng-include[1]/div/div/section[2]/ul[1]/li[4]/a/div[1]/i";
	public static final String testingrespond = "//*[@id='form-container']/ng-include/div/ng-include[2]/div[1]/a[2]";
	public static final String testingdone = "//*[@id='form-container']/ng-include/div/ng-include[2]/div[1]/a[2]";
	
	//For counting all the inbox items 
	public static final String draftcountpath = "//*[@id='inbox-container']/ng-include[1]/div/div/section[2]/ul[2]/li[2]/a/span[2]";
	public static final String inputrequestcountpath="//*[@id='inbox-container']/ng-include[1]/div/div/section[2]/ul[1]/li[3]/a/span[2]";
	public static final String clarificationcountpath="//*[@id='inbox-container']/ng-include[1]/div/div/section[2]/ul[1]/li[4]/a/span[2]";
	public static final String afterclarificationspath="//*[@id='inbox-container']/ng-include[1]/div/div/section[2]/ul[1]/li[3]/a/span[2]";
	public static final String approvalspath="//*[@id='inbox-container']/ng-include[1]/div/div/section[2]/ul[1]/li[2]/a/span[2]";
	public static final String rejectedpath="//*[@id='inbox-container']/ng-include[1]/div/div/section[2]/ul[2]/li[5]/a/span[2]";
	public static final String Afterrejectdraftcountpath="//*[@id='inbox-container']/ng-include[1]/div/div/section[2]/ul[2]/li[2]/a/span[2]";
	public static final String secondruntoinputcountpath="//*[@id='inbox-container']/ng-include[1]/div/div/section[2]/ul[1]/li[3]/a/span[2]";
	public static final String secondruntoapprovalspath="//*[@id='inbox-container']/ng-include[1]/div/div/section[2]/ul[1]/li[2]/a/span[2]";
	public static final String approvedpath="//*[@id='inbox-container']/ng-include[1]/div/div/section[2]/ul[2]/li[4]/a/span[2]";
	public static final String countapprovedpath="//*[@id='inbox-container']/ng-include[1]/div/div/section[2]/ul[2]/li[4]/a/span[2]";
	
	
	
}
