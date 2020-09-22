package test01;

public interface FirstJdbcDao {
	public void execute(String sql);
	public int insert(String code, String name, int price, String maker);
	public int delete(String name);
	

}
