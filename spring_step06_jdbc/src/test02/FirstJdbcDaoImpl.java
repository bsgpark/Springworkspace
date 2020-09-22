package test02;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class FirstJdbcDaoImpl extends JdbcDaoSupport implements FirstJdbcDao{

	//전체보기2------------------------------------------------------------------
	@Override
	public List<GoodsEntity> listGoods() {
		RowMapper<GoodsEntity> rowMapper = new GoodsRowMapperEx();
		return super.getJdbcTemplate().query("SELECT * FROM GOODSINFO", rowMapper);
	}
	//중첩클래스 : FirstJdbcDaoImpl$GoodsRowMapperEx.class
	public class GoodsRowMapperEx implements  RowMapper<GoodsEntity>{

		@Override
		public GoodsEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
			GoodsEntity entity = new GoodsEntity();
			entity.setCode(rs.getString("CODE"));//code: 컬럼명
			entity.setName(rs.getString("NAME"));
			entity.setPrice(rs.getInt("PRICE"));
			entity.setMaker(rs.getString("MAKER"));
			return entity;
		}
		
	}
	
	//검색하기-----------------------------------------------------------------------
	@Override
	public GoodsEntity findGoods(String code) {
		RowMapper <GoodsEntity> mapper = new RowMapper<GoodsEntity>() {

			@Override
			public GoodsEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
				GoodsEntity entity = new GoodsEntity();
				entity.setCode(rs.getString("CODE"));//code: 컬럼명
				entity.setName(rs.getString("NAME"));
				entity.setPrice(rs.getInt("PRICE"));
				entity.setMaker(rs.getString("MAKER"));
				return entity;
			}
			
		};
		return super.getJdbcTemplate().queryForObject("SELECT * FROM GOODSINFO WHERE CODE = ?",mapper,code);
	}
	
	
	//수정하기----------------------------------------------------------------------
	//update goodsinfo set name = ?, price = ?, maker = ? where code = ?
	@Override
	public int update(GoodsEntity entity) {
		return super.getJdbcTemplate().update(
				"UPDATE GOODSINFO SET NAME = ?, PRICE = ?, MAKER = ? WHERE CODE=?",
				new Object[] {entity.getName(), entity.getPrice(), entity.getMaker(), entity.getCode()});
	}

}
