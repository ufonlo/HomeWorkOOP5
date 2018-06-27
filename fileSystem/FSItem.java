package fileSystem;
import java.util.ArrayList;
public interface FSItem {
	String getName();
	int getSize();
	
	ArrayList<FSItem> getItems();
	

}
