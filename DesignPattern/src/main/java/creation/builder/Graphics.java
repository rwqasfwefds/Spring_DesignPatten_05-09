package creation.builder;

/**
 * packageName : creation.builder
 * fileName : Graphics
 * author : ds
 * date : 2022-05-09
 * description : Graphics 클래스 (빌더에서 조합된 클래스)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-09         ds          최초 생성
 */
public class Graphics {
    String graphic;

    public Graphics(String graphic) {
        this.graphic = graphic;
    };

    public String getInfo(){
        return graphic;
    }
}
