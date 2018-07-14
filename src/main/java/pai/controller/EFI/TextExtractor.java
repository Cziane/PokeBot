package pai.controller.EFI;

import java.util.Vector;

import org.opencv.core.Mat;
import org.opencv.core.Rect;

public interface TextExtractor {
	
	public Vector<Rect> getLetterBox();
	
	public Vector<String> extractText(Mat image);
}
