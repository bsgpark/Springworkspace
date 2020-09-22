package test01;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class FirstJdbcDaoImpl extends JdbcDaoSupport implements FirstJdbcDao{

	//실행------------------------------------
	@Override
	public void execute(String sql) {
		System.out.println("교재코드  교재명  가격  출판사");
		System.out.println("----------------------");
		super.getJdbcTemplate().query(sql,new GoodsRowMapperEx<Object>());
	}
	//중첩클래스(inner class): 클래스 안에서 다른 클래스를 정의 하는 것
	//FirstJdbcDaoImpl$GoodsRowMapper이 생김
	//navigator로 확인하면 class이름 뒤에 $이 붙고 클래스가 생기는걸 확인할 수 있다.
	public class GoodsRowMapperEx<T> implements RowMapper<T>{

		@Override
		public T mapRow(ResultSet rs, int rowNum) throws SQLException {
			String code = rs.getString("CODE");//code: 컬럼명
			String name = rs.getString("NAME");
			int price = rs.getInt("PRICE");
			String maker = rs.getNString("MAKER");
			
			System.out.printf("%s %s %d %s\n",code,name,price,maker);
			return null;
		}
		
	}
	
	//추가하기---------------------------------
	@Override
	public int insert(String code, String name, int price, String maker) {
		return super.getJdbcTemplate().update(
				"INSERT INTO GOODSINFO(CODE,NAME,PRICE,MAKER)VALUES(?,?,?,?)",
				new Object[] {code,name,price,maker});
	}
	//삭제하기------------------------------------------
	@Override
	public int delete(String name) {
		return super.getJdbcTemplate().update("DELETE FROM GOODINFO WHERE NAME = ?",name);
	}

}
