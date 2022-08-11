package prog1;

class Security{
	private  int Security_code;
	private  String Branch_name;
	private  int Branch_code;
	private  String Dept_name;
	private  int Dept_code;
	
	public int getSecurity_code() {
		return Security_code;
	}
	public void setSecurity_code(int security_code) {
		Security_code = security_code;
	}
	public String getBranch_name() {
		return Branch_name;
	}
	public void setBranch_name(String branch_name) {
		Branch_name = branch_name;
	}
	public int getBranch_code() {
		return Branch_code;
	}
	public void setBranch_code(int branch_code) {
		Branch_code = branch_code;
	}
	public String getDept_name() {
		return Dept_name;
	}
	public void setDept_name(String dept_name) {
		Dept_name = dept_name;
	}
	public int getDept_code() {
		return Dept_code;
	}
	public void setDept_code(int dept_code) {
		Dept_code = dept_code;
	}}




public class Encapprob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Security obj=new Security();
		obj.setDept_name("HR");
		obj.setBranch_code(324);
		obj.setDept_code(5);
		obj.setBranch_name("tex");
		obj.setSecurity_code(456);
		
		System.out.println("Security code:"+obj.getSecurity_code());

	}

}
