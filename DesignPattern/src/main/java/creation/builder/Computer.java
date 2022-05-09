package creation.builder;

/**
 * packageName : creation.builder
 * fileName : Computer
 * author : ds
 * date : 2022-05-09
 * description : 부품(cpu, ram, graphics)을 조립 할 컴퓨터 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-09         ds          최초 생성
 */
public class Computer {
    private Cpu cpu;
    private Graphics graphics;
    private Ram ram;

//    기본 생성자
    public Computer() {

    };

//    매개변수 3개 생성자
    public Computer(Cpu cpu, Graphics graphics, Ram ram) {
        this.cpu = cpu;
        this.graphics = graphics;
        this.ram = ram;
    };

//    컴퓨터 부품 정보 출력 메소드
    public void computerInfo(){
        String cpuInfo = cpu == null ? "cpu 없음" : cpu.getInfo();
        String ramInfo = ram == null ? "ram 없음" : ram.getInfo();
        String graphicsInfo = graphics == null ? "내장 그래픽" : graphics.getInfo();

//        화면 출력
        System.out.println("컴퓨터 정보 출력 : "
                            + "Cpu : " + cpuInfo
                            + ", Ram : " + ramInfo
                            + ", graphics : " + graphicsInfo);
    };

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Graphics getGraphics() {
        return graphics;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }
}
