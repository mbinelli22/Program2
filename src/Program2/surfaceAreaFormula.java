package Program2;
//Michael Binelli
public class surfaceAreaFormula {
	public static void main(String[] args) {
		double length;
		double width;
		double height;
		String unitOfMeasurement = "inches";
		length = 250.25;
		width = 200.50;
		height = 120;
		double surfaceAreaOfFloor = length * width;
		double surfaceAreaOfFourWalls = (length*height*2) + (width*height*2);
		System.out.print("Surface area of floor: " + surfaceAreaOfFloor + " " + unitOfMeasurement);
		System.out.println();
		System.out.print("Surface area of four walls: " + surfaceAreaOfFourWalls + " " + unitOfMeasurement);
	}
}
