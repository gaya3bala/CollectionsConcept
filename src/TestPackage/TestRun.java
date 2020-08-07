package TestPackage;

public class TestRun {

	public static void main(String[] args) {
		
		ParentClass ps = new ParentClass();
		ps.start();
		
		ChildClass cs = new ChildClass();
		cs.start();		
		cs.stop();

	}

}
