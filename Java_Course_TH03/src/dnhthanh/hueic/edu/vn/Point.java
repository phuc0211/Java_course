package dnhthanh.hueic.edu.vn;

public class Point {
	private float x;//Tọa độ x
	private float y;//Tọa độ y

	public float getX() {
		return x;
	}

	@Override
	public String toString() {
		return "Point{" + "x=" + x + ", y=" + y + '}';
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public Point(float x, float y) {

		this.x = x;
		this.y = y;
	}

	public Point() {
		this.x = Math.round(Math.random()*50);
		this.y = Math.round(Math.random()*50);
	}
	public double KhoangCach(Point A){
		double kc;
		kc = Math.sqrt((Math.pow(this.x - A.getX(), 2) + Math.pow(this.y - A.getY(), 2) ));
		return kc;
	}
	//Tạo getters và setters cho x và y
}
