package projectProxy;

public class Main {
	
	public static void main(String[] args) {
		// COM PROXY
		Image i = new Image();
		Graphic g = new ImageProxy(i);
		
		g.draw();
		g.getExtend();
		
		
		// SEM PROXY
		g = i;
		
		g.draw();
		g.getExtend();
		
	}
}
