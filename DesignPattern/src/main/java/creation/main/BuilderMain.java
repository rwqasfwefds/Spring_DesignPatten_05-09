package creation.main;

import creation.builder.*;

/**
 * packageName : creation.main
 * fileName : BuilderMain
 * author : ds
 * date : 2022-05-09
 * description : 빌더를 이용해 컴퓨터 생성자를 대신함(필요한 것만 생성)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-09         ds          최초 생성
 */
public class BuilderMain {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("Intel core i7");
        Ram ram = new Ram("16GB");
        Graphics graphics = new Graphics("RTX-3090");
        
//        Builder 를 이용해서 원하는 구성으로 컴퓨터를 조립
//        Builder 생성자를 호출하면 컴퓨터가 생성됨
        Builder builder = new Builder();
//        Builder의 set함수는 값을 넣음과 동시에 다시 Builder을 반환하니깐 체인메소드 쌉가능
        Computer premiumPC = builder.setCpu(cpu)
                .setRam(ram)
                .setGraphics(graphics)
                .build(); // 값이 설정된 computer 객체가 반환
        
//        프리미엄 컴퓨터 정보 보기
        premiumPC.computerInfo();

//        저가형 컴퓨터 조립
        Cpu cpu2 = new Cpu("Intel core i7");
        Ram ram2 = new Ram("8GB");
        Graphics graphics2 = new Graphics("RTX-3060");

        System.out.println("----- middleCostPc -----");
        builder = new Builder();
        Computer middleCostPc = builder.setCpu(cpu2)
                .setGraphics(graphics2)
                .build(); // 값이 설정된 computer 객체가 반환

//        중저가형 PC 정보 출력
        middleCostPc.computerInfo();
        
        System.out.println("----- lowerCostPc -----");
        builder = new Builder();
        Computer lowerCostPc = builder.setCpu(cpu2)
                .setRam(ram2)
                .build(); // 값이 설정된 computer 객체가 반환

//        저가형 PC 정보 출력
        lowerCostPc.computerInfo();
        
        System.out.println("----- superlowerCostPc -----");
        builder = new Builder();
        Computer superlowerCostPc = builder.setCpu(cpu2)
                .build(); // 값이 설정된 computer 객체가 반환

//        쌉 ㅈ밥 PC 정보 출력
        superlowerCostPc.computerInfo();
    }
}
