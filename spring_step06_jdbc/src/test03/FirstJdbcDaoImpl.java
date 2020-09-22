package test03;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class FirstJdbcDaoImpl implements FirstJdbcDao {
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// 전체보기
	// 1(익명중첩클래스)----------------------------------------------------------------------
	@Override
	public void execute(String sql) throws DataAccessException {
		System.out.println("교재코드  교재명  가격  출판사");
		System.out.println("----------------------");
		RowMapper<GoodsEntity> mapper = new RowMapper<GoodsEntity>() {
			@Override
			public GoodsEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
				String code = rs.getString("CODE");//code: 컬럼명
				String name = rs.getString("NAME");
				int price = rs.getInt("PRICE");
				String maker = rs.getNString("MAKER");
				System.out.printf("%s %s %d %s\n",code,name,price,maker);
				return null;
		}
		};
		jdbcTemplate.query(sql,mapper);
	}
	
//전체보기2-------------------------------------------------

	@Override
	public List<GoodsEntity> listGoods() throws DataAccessException {
		RowMapper<GoodsEntity> mapper=new RowMapper<GoodsEntity>(){
			@Override
			public GoodsEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
				GoodsEntity entity=new GoodsEntity();
				entity.setCode(rs.getString("CODE"));    
				entity.setName(rs.getString("NAME"));
				entity.setPrice(rs.getInt("PRICE"));
				entity.setMaker(rs.getString("MAKER"));
				return entity;
			}
		};
		return jdbcTemplate.query("SELECT * FROM GOODSINFO", mapper);
	}
//추가하기------------------------------------------------------------

	@Override
	public int insert(GoodsEntity entity) throws DataAccessException {
		return jdbcTemplate.update("insert into goodsinfo(code,name,price,maker) values(?,?,?,?)",
				new Object[] {entity.getCode(),entity.getName(),entity.getPrice(),entity.getMaker()});
				
	}
//삭제하기----------------------------------------------------------
	@Override
	public int delete(String name) throws DataAccessException {
		return jdbcTemplate.update(
				"DELETE FROM GOODSINFO WHERE NAME = ?",name);
	}
//전체보기2
	@Override
	public GoodsEntity findGoods(String code) throws DataAccessException {
		RowMapper<GoodsEntity> mapper=new RowMapper<GoodsEntity>(){
			@Override
			public GoodsEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
				GoodsEntity entity=new GoodsEntity();
				entity.setCode(rs.getString("CODE"));    
				entity.setName(rs.getString("NAME"));
				entity.setPrice(rs.getInt("PRICE"));
				entity.setMaker(rs.getString("MAKER"));
				return entity;
			}
		};
		return jdbcTemplate.queryForObject("SELECT * FROM GOODSINFO WHERE CODE = ?",mapper, code);
		}
//수정하기
	@Override
	public int update(GoodsEntity entity) throws DataAccessException {
		return jdbcTemplate.update(
				"UPDATE GOODSINFO SET NAME = ?, PRICE = ?, MAKER = ? WHERE CODE = ? ",
				new Object[] {entity.getName(),entity.getPrice(),entity.getMaker(),entity.getCode()});
	}
}
	