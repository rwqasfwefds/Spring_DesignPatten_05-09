package creation.main;

import creation.builder.Computer;
import creation.builder.Cpu;
import creation.builder.Graphics;
import creation.builder.Ram;

/**
 * packageName : creation.main
 * fileName : NoBuilderMain
 * author : ds
 * date : 2022-05-09
 * description : 기본 생성자와 매개변수 생성자를 이용해 값 초기화
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-09         ds          최초 생성
 */
public class NoBuilderMain {
    public static void main(String[] args) {
//        프리미엄 컴퓨터 조립
        Cpu cpu = new Cpu("Intel core i7");
        Ram ram = new Ram("16GB");
        Graphics graphics = new Graphics("RTX-3090");

//        매개변수 3개 Computer 생성자 호출
        Computer premiumPC = new Computer(cpu, graphics, ram);
//        컴퓨터 사양 정보 출력
        premiumPC.computerInfo();
        
//        저가형 컴퓨터 조립
        Cpu cpu2 = new Cpu("Intel core i7");
        Ram ram2 = new Ram("8GB");
        Graphics graphics2 = new Graphics("RTX-3060");

//        미들 저가 컴퓨터
        System.out.println("----- MiddleCostPC -----");
        Computer middleCostPC = new Computer(cpu2, graphics2, null);
//        컴퓨터 사양 정보 출력
        middleCostPC.computerInfo();

        System.out.println("----- lowerCostPC -----");
        Computer lowerCostPC = new Computer(cpu2, null, ram);
//        컴퓨터 사양 정보 출력
        lowerCostPC.computerInfo();

        System.out.println("----- superlowerCostPC -----");
        Computer superlowerCostPC = new Computer(cpu2, null, null);
//        컴퓨터 사양 정보 출력
        superlowerCostPC.computerInfo();
    }
}
