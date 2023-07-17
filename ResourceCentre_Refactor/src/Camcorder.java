
public class Camcorder extends Item{
	private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
		String output = "Asset Tag: " + getAssetTag() + "\n";
	    output += "Description: " + getDescription() + "\n";
	    output += "Optical Zoom: " + opticalZoom + "\n";
		return output;
	}
}

