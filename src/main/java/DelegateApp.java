import graphicImpl.Square;
import graphicImpl.Triangle;

public class DelegateApp {
	
	public static void main(String[] args) {
		
	 Painter painter = new Painter();
	 painter.setGraphic(new Square());
	 painter.draw();
	 
	 painter.setGraphic(new Triangle());
	 painter.draw();
	}
}
