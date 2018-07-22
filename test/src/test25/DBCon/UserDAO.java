package test25.DBCon;

import java.util.ArrayList;
import java.util.HashMap;

public interface UserDAO {
	
	public ArrayList<HashMap<String,String>> selectUserList();
	public int insertUser();	
	public int deleteUser();
	public int updateUser();
	
	public void showUser();

}
