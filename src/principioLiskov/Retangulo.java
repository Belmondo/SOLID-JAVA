package principioLiskov;

public class Retangulo {
	
	private double height;
    
	private double width;
    
    public void setHeight(double h) { 
    	height = h; 
    }
    
    public void setWidht(double w) { 
    	width = w; 
    }
    
    public double getArea() {
    	return width*height;
    }

}
