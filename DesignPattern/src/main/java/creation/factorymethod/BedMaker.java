package creation.factorymethod;

/**
 * packageName : creation.factorymethod
 * fileName : BedMaker
 * author : ds
 * date : 2022-05-09
 * description : Bed Maker Class(Interface : Furniture)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-09         ds          최초 생성
 */
public class BedMaker implements Furniture {
    public BedMaker() {
        System.out.println("Bed Make Waiting");
    };

    @Override
    public void make() {
        System.out.println("Bed Make");
    };

    @Override
    public void newDesign() {
        System.out.println("Research new Bed");
    };
}
