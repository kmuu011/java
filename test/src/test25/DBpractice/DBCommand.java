package test25.DBpractice;

import java.util.ArrayList;
import java.util.HashMap;

public interface DBCommand {
	
	public ArrayList<HashMap<String,String>> selectUL();
	
	public int insertUser();
	
	public int updateUser();
	
	public int deleteUser();
	
	public void showUsersAll();
	
	public String getName();


}
