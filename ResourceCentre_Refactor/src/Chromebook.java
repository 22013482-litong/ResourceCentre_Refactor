
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	public String toString(){
		 String output = "Asset Tag: " + getAssetTag() + "\n";
		    output += "Description: " + getDescription() + "\n";
		    output += "Operating System: " + os + "\n";
		return output;
	}
}


