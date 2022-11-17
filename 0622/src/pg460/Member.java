package pg460;

public class Member {
	public String id;
	public Member(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		Member mm = (Member) obj;
		if(this.id.equals(mm.id)){
			return true;
		}
		return false;
	}
	
}
