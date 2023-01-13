package packge1;

class MethodOverriding {
	int rno=10;
	void display() {
		System.out.println(rno);
	}
}

class EnggStud10 extends MethodOverriding{
	String branch = "IT";
	void display() {
		System.out.println(branch);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnggStud10 es = new EnggStud10();
		es.display();
	}
}

