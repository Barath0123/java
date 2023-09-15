package selenium;

public class Constructor {
	
	private static  int side;
	private static double width;
	private static double height;
	private static double depth;
	
	public Constructor	(int side  ,double width ,double height ,double depth) {
		this.depth=depth;
		this.height=height;
		this.side=side;
		this.width=width;
	}
	
	public void square(int side  ,double width ,double height ,double depth) {
		int sq;
		sq = side*side;
		System.out.println("Area of Square:" + sq);
	}
		
		public void rectange(int side  ,double width ,double height ,double depth)
		{
			double rec;
			rec = width*height;
			System.out.println("Area of Rectangle:" + rec);
		}
		
		public void perimeter(int side  ,double width ,double height ,double depth)
		{
			double peri;
			peri = width+height+depth;
			System.out.println("Perimeter of Rectengle:" + peri);
		}
		public static void main(String[] args) {
			Constructor squ =new Constructor(side,width,height,depth);
			squ.square (6,0,0,0);
			Constructor rec = new Constructor(side,width,height,depth);
			rec.rectange(0,6,8,0);
			Constructor perim = new Constructor(side,width,height,depth);
			perim.perimeter(0, 2, 2, 2);
		}
		
		
	
	
}