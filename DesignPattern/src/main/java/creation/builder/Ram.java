package creation.builder;

/**
 * packageName : creation.builder
 * fileName : Ram
 * author : ds
 * date : 2022-05-09
 * description : Ram 클래스 (빌더에서 조합된 클래스)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-09         ds          최초 생성
 */
public class Ram {
    String ram;

    public Ram(String ram) {
        this.ram = ram;
    };

    public String getInfo(){
        return ram;
    };
}
