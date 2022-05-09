package creation.main;

import creation.factorymethod.IkeaFactory;

/**
 * packageName : creation.main
 * fileName : IkeaMain
 * author : ds
 * date : 2022-05-09
 * description : Test Class
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-09         ds          최초 생성
 */
public class IkeaMain {
    public static void main(String[] args) {
//        공장 생성(객체 생성은 공장에서 함, 디자인 패턴(공장패턴))
        IkeaFactory ikeaFactory = new IkeaFactory();

//        "."으로 연결하면 바로바로 쓸 수 있음(메소드 체인)
//        order메소드에 desk를 넣는순간 객체(인스턴스)가 생성되기 때문에 거기에 해당하는 메소드를 바로 쓸 수 있음
        System.out.println("order 1 : desk");
        ikeaFactory.order("desk").make(); // 책상을 만듦

        System.out.println("order 1 : chair");
        ikeaFactory.order("chair").make(); // 의자를 만듦

        System.out.println("research : Bed Make");
        ikeaFactory.order("bed").newDesign(); // 침대 만들기 연구
    }
}
