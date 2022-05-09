package creation.singleton;

/**
 * packageName : creation.singleton
 * fileName : Singleton
 * author : ds
 * date : 2022-05-09
 * description : 공유 객체 (Singleton)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-09         ds          최초 생성
 */
public class Singleton {
    private static Singleton singleton = null;

//    생성자를 다른 클래스에서 호출하지 못하게 막음(안에서만 쓸 수 있게)
    private Singleton() {
        System.out.println("instance creation complete");
    };
    
//    Singleton 만드는데 이미 만들어져 있으면 객체를 생성하지 않음
    public static Singleton getInstance(){
//        객체 생성이 안 되어 있으면 하나 생성
        if(singleton == null){
//            생성자가 private 이니깐 이 클래스 안에서만 new연산자 가능
            singleton = new Singleton();
        };
//        null이 아니라면 객체가 생성이 되어있으니 그걸 리턴함
        return singleton;
    };
}
