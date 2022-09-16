package operator;

 class Runtimaepoly {
void show() {
	System.out.println("show anything");
}
}
class abcd extends Runtimaepoly {
	void show() {
		System.out.println("show nothing");
	}
	public static void main(String[]args) {
		Runtimaepoly t=new abcd();
		t.show();
	}
}