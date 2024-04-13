package submission1;

public class EncapsulationClassA {
	
	private String userName; //variables
	private int userAge;
	private long userPhnNo;
	
	//for username
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	//for userage
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	//for userphoneno
	public long getUserPhnNo() {
		return userPhnNo;
	}
	public void setUserPhnNo(long userPhnNo) {
		this.userPhnNo = userPhnNo;
	}

}

// ************************************************************************

package submission1;

public class EncapsulationClassB {

	public static void main(String[] args) {
		
		EncapsulationClassA obj = new EncapsulationClassA();
		
		//for name
		obj.setUserName("Indranil Dutta");
		System.out.println(obj.getUserName());
		
		//for age
		obj.setUserAge(99);
		System.out.println(obj.getUserAge());
		
		//for phone no
		obj.setUserPhnNo(5545554545l);
		System.out.println(obj.getUserPhnNo());

	}

}


