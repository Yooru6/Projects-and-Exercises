package Proxy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

interface Image {
    public void displayImage();
    public void showData();
}

// On System A
class RealImage implements Image {
    private String filename;
   

    /**
     * Constructor
     * @param filename
     */
    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    /**
     * Loads the image from the disk
     */
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        System.out.println("Displaying " + filename);
    }

	@Override
	public void showData() {
		int index = filename.lastIndexOf("\\");
		String fileName = filename.substring(index + 1);
		System.out.println(fileName);
		// TODO Auto-generated method stub
		
	}
}

// On System B
class ProxyImage implements Image {
    private String filename=null;
    private RealImage image=null;
    
    
    /**
     * Constructor
     * @param filename
     */
    public ProxyImage(String filename) {
        this.filename = filename;
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename);
        }
        image.displayImage();
    }

	@Override
	public void showData() {
		//int index = filename.lastIndexOf("\");
		String fileName = filename.substring(filename.lastIndexOf("\\")+1, filename.length());
		System.out.println("name of the file: "+fileName);
		// TODO Auto-generated method stub
		
	}
}

