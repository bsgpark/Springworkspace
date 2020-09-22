package anno02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//@Component 인 경우 myFoodMgr로 객체가 생선된다(첫번째 문자만 소문자로 바뀜)
@Component(value = "myFood") //기본이름 : myFoodMgr
public class MyFoodMgr {
	@Autowired
	//객체를 바꾸게 하는  @Qualifier(value = "unfavoriteFood")
	private Food favoriteFood;
	@Autowired //autovired를 쓰면 setter를 생략할 수 있다
	private Food unfavoriteFood;
	
	/*
	 * public void setFavoriteFood(Food favoriteFood) { this.favoriteFood =
	 * favoriteFood; } public void setUnfavoriteFood(Food unfavoriteFood) {
	 * this.unfavoriteFood = unfavoriteFood; }
	 */
	@Override
	public String toString() {
		return "MyFoodMgr [좋아하는 음식=" + favoriteFood + ", 싫어하는 음식=" + unfavoriteFood + "]";
	}
	
	

}
