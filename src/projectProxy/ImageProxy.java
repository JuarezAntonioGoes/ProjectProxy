package projectProxy;

public class ImageProxy implements Graphic{

	private Image image;
	
	public ImageProxy(Image image) {
			this.image = image;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Proxy executou para draw");
		image.draw();
		
	}

	@Override
	public void getExtend() {
		// TODO Auto-generated method stub
		System.out.println("Proxy executou para getExtend");
		image.getExtend();
	}

}
