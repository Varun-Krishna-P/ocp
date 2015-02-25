package ch01;
class TestServer{
	int count = 9;
	public void login(){
		int count = 10;
		System.out.println("Local Variable count: "+count);
	}
	public void count(){
		System.out.println("Instance Variable count: "+count);		
	}
	public static void main(String args[]){
		new TestServer().login();
		new TestServer().count();
	}
}