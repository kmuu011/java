package test25.database.command;

import java.util.ArrayList;
import java.util.HashMap;

public interface DBCommand {
	
	public int insertUser(HashMap<String, String> info);
	public int updateUser(HashMap<String, String> info);
	public int deleteUser(HashMap<String, String> info);
	public ArrayList<HashMap<String, String>> selectUserList(HashMap<String, String> info);

	public void showUser();
}
