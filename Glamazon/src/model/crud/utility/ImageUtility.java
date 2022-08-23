package model.crud.utility;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

import javax.swing.ImageIcon;

public class ImageUtility {
	
	public static String encodeImage(String imagename) {
		String encoded = "";
		try {
			byte[] originalBytes = Files.readAllBytes(Paths.get(ImageUtility.class.getResource("/" + imagename).toURI()));
			byte[] encodedBytes = Base64.getEncoder().encode(originalBytes);
			encoded = new String(encodedBytes);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return encoded;
	}
	
	public static ImageIcon decodeImage(String encodedImage) {
		byte[] decoded = Base64.getDecoder().decode(encodedImage);
		ImageIcon icon = new ImageIcon(decoded);		
		return icon;
	}
	

}
