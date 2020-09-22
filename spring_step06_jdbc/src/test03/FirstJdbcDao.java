package test03;

import java.util.List;
import org.springframework.dao.DataAccessException;

public interface FirstJdbcDao {
	public void execute(String sql) throws DataAccessException;//전체보기1
	public List<GoodsEntity> listGoods() throws DataAccessException;      //전체보기2
	public int insert(GoodsEntity entity) throws DataAccessException;//추가하기
	public int delete(String name) throws DataAccessException;//삭제하기
	public GoodsEntity findGoods(String code) throws DataAccessException; //검색하기
	public int update(GoodsEntity entity) throws DataAccessException;     //수정하기

}
