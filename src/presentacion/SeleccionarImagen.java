package presentacion;

import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class SeleccionarImagen {
	public Image SelectImage() {
		JFileChooser file = new JFileChooser();
		file.setCurrentDirectory(new File(System.getProperty("user.home")));
		// filter the files
		FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
		file.setFileFilter(filter);
		int result = file.showSaveDialog(null);
		Image img = null;
		// if the user click on save in Jfilechooser
		if (result == JFileChooser.APPROVE_OPTION) {
			File selectedFile = file.getSelectedFile();
			String path = selectedFile.getAbsolutePath();
			ImageIcon MyImage = new ImageIcon(path);
			img = MyImage.getImage();
			
		} else if (result == JFileChooser.CANCEL_OPTION) {
			System.out.println("No File Select");
		}
		return img;
	}
}
