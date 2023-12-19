package class_1912;

class gettersetter
{
	
//	public gettersetter(int x, int y) {
//		super();
//		this.x = x;
//		this.y = y;
//	}

	private int x,y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}

public class classobjconstruc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gettersetter gs = new gettersetter();
		gs.setX(545);
		gs.setY(654);
		
		System.out.println("The Value of X :"+gs.getX());
		System.out.println("The Value of Y :"+gs.getY());
	}

}
