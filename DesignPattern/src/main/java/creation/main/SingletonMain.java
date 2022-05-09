package creation.main;

import creation.singleton.Singleton;

/**
 * packageName : creation.main
 * fileName : SingletonMain
 * author : ds
 * date : 2022-05-09
 * description : Singleton Test, 실제 객체가 하나 만들어지는지 확인
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-09         ds          최초 생성
 */
public class SingletonMain {
    public static void main(String[] args) {
        System.out.println("Start Test");

//       getInstance() : 객체가 있으면 패스하고 없으면 하나 만들어줌
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2){
            System.out.println("dbj1 == obj2");
        } else{
            System.out.println("dbj1 != dbj2");
        }
    }
}
