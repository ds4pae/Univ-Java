package RadioButtonGalleryLoginArrayList;

public class UserInfo {
	public String ID;
	public String PW;
	public String PhoneNum;
	
	public UserInfo() {
	
	}

	public UserInfo(String ID, String PW, String PhoneNum) {
		// TODO Auto-generated constructor stub
		this.ID = ID;
		this.PW = PW;
		this.PhoneNum = PhoneNum;
	}
	
	public String getID() {
		return this.ID;
	}
	
	public String getPW() {
		return this.PW;
	}
	public String getPhoneNum() {
		return this.PhoneNum;
	}
}
