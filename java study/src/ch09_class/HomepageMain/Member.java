package ch09_class.HomepageMain;

public class Member {
	private String stuId;
	private String id;
	private String passWord;
	private String name;
	
	public Member() {}
	
	public Member(String id,String password, String name) {
		MemberDB memDB = MemberDB.getInstance();
		this.stuId = memDB.makeStuID();   
		this.id = id;             
		this.passWord = password; 
		this.name = name;  
	}
	
	public Member(String stuId, String id, String passWord, String name) {
		super();
		this.stuId = stuId;       /*  학번   */ 
		this.id = id;             /*  아이디  */ 
		this.passWord = passWord; /* 비밀번호  */ 
		this.name = name;         /*  이름   */ 
	}

	

	@Override
	public String toString() {
		return "Member [stuId=" + stuId + ", id=" + id + ", passWord=" + passWord + ", name=" + name + "]";
	}



	public String getStuId() {
		return stuId;
	}



	public void setStuId(String stuId) {
		this.stuId = stuId;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPassWord() {
		return passWord;
	}



	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
