import graphic.Graphic;

public class Painter {
	
	Graphic graphic;
	
	void setGraphic(Graphic g){
		graphic = g;
		
	}
	void draw(){
		graphic.draw();
	}
}
