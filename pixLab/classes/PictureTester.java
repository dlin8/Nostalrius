/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
    /** Method to test zeroBlue */
    public static void testZeroBlue()
    {
	Picture beach = new Picture("beach.jpg");
	beach.explore();
	beach.zeroBlue();
	beach.explore();
    }
  
    /** Method to test mirrorVertical */
    public static void testMirrorVertical()
    {
	Picture caterpillar = new Picture("caterpillar.jpg");
	caterpillar.explore();
	caterpillar.mirrorVertical();
	caterpillar.explore();
    }
  
    /** Method to test mirrorTemple */
    public static void testMirrorTemple()
    {
	Picture temple = new Picture("temple.jpg");
	temple.explore();
	temple.mirrorTemple();
	temple.explore();
    }
  
    /** Method to test the collage method */
    public static void testCollage()
    {
	Picture canvas = new Picture("640x480.jpg");
	canvas.createCollage();
	canvas.explore();
    }
  
    /** Method to test edgeDetection */
    public static void testEdgeDetection()
    {
	Picture swan = new Picture("swan.jpg");
	swan.edgeDetection(10);
	swan.explore();
    }

    public static void mirrorVerticalRightToLeft(){
	Pixel[][] pixels = this.getPixels2D();
	Pixel leftPixel = null;
	Pixel rightPixel = null;
	int width = pixels[0].length;
	for (int row = 0; row < pixels.length; row++)
	    {
		for (int col = 0; col < width / 2; col++)
		    {
			leftPixel = pixels[row][col];
			rightPixel = pixels[row][width ¡V 1 - col];
			//some temporary pointer is needed, don't know the return type.
			leftPixel.setColor(rightPixel.getColor());
			rightPixel.setColor(leftPixel.getColor());
		    }
	    } 
    }

    public static void mirrorHorizontal(){
	Pixel[][] pixels = this.getPixels2D();
	Pixel leftPixel = null;
	Pixel rightPixel = null;
	int width = pixels[].length;
	for (int col = 0; col < width; col++)
	    {
		for (int row = 0; row < pixels.length / 2; row++)
		    {
			topPixel = pixels[row][col];
			botPixel = pixels[pixels.length - 1 - row][col];
			//some temporary pointer is needed, don't know the return type.
			botPixel.setColor(topPixel.getColor());
		    }
	    } 
    }
    public static void mirrorHorizontalBotToTop(){
	Pixel[][] pixels = this.getPixels2D();
	Pixel leftPixel = null;
	Pixel rightPixel = null;
	int width = pixels[].length;
	for (int col = 0; col < width; col++)
	    {
		for (int row = 0; row < pixels.length / 2; row++)
		    {
			topPixel = pixels[row][col];
			botPixel = pixels[pixels.length - 1 - row][col];
			//some temporary pointer is needed, don't know the return type.
			topPixel.setColor(botPixel.getColor());
			botPixel.setColor(topPixel.getColor());
		    }
	    } 
    }
  
    /** Main method for testing.  Every class can have a main
     * method in Java */
    public static void main(String[] args)
    {
	// uncomment a call here to run a test
	// and comment out the ones you don't want
	// to run
	testZeroBlue();
	//testKeepOnlyBlue();
	//testKeepOnlyRed();
	//testKeepOnlyGreen();
	//testNegate();
	//testGrayscale();
	//testFixUnderwater();
	//testMirrorVertical();
	//testMirrorTemple();
	//testMirrorArms();
	//testMirrorGull();
	//testMirrorDiagonal();
	//testCollage();
	//testCopy();
	//testEdgeDetection();
	//testEdgeDetection2();
	//testChromakey();
	//testEncodeAndDecode();
	//testGetCountRedOverValue(250);
	//testSetRedToHalfValueInTopHalf();
	//testClearBlueOverValue(200);
	//testGetAverageForColumn(0);
    }
}
