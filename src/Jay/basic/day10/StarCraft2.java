package Jay.basic.day10;

public class StarCraft2 {
    //인터페이스 기반으로 스타크래프트 유닛을 정의해 봄
    public static void main(String[] args) {
    SCV2 s = new SCV2();

        System.out.println("SCV의 체력" + s.hp );
        s.attack();
        s.move();
        s.specialAbilty();

    Marine2 m = new Marine2();
        System.out.println("Marine의 체력" + m.hp);
        m.attack();
        m.move();
        m.specialAbilty();

        Firebat2 f = new Firebat2();
        System.out.println("Firebat의 체력" + f.hp);
        f.attack();
        f.move();
        f.specialAbilty();

}
}

abstract class Unit2 {
    protected String name;
    protected int hp;
    protected int power;
    protected double mvspd;
    protected int mineral;
    protected int gas;

    public Unit2() {
    }
//    public Unit2(String name, int hp, int power, double mvspd, int mineral, int gas) {
//        this.name = name;
//        this.hp = hp;
//        this.power = power;
//        this.mvspd = mvspd;
//        this.mineral = mineral;
//        this.gas = gas;
//
//    }

//    abstract public void attack();
//    abstract public void move();
//    abstract public void specialAbilty();
}


    // 추상클래스에서 정의했던 추상메서드를
// 독립적인 코드들로 분리함 ->인터페이스
    interface Unit2Action {
        abstract public void attack();

        void move();                //abstract public 생략 가능

        void specialAbilty();
    }


    class SCV2 extends Unit2 implements Unit2Action {

        final String fmtattack = "융합절단기를 리용해서 대상에 %d의 피해를 주고있습니다\n";
        final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다\n";
        final String fmtspabty = "대상을 수리하는 중입니다\n";

        public SCV2() {
            name = "건설로봇";
            hp = 45;
            power = 5;
            mvspd = 2.81;
            mineral = 50;
            gas = 0;
        }

        @Override
        public void attack() {
            // sout("융합절단기를 이용해서...")
            // 추상메서드를 이용해서 부모클래스에 정의딘
            // attack메서드를 유닛에 맞게 재정의함
            System.out.printf(fmtattack, power);
        }

        @Override
        public void move() {
            System.out.printf(fmtmove, mvspd);
        }

        @Override
        public void specialAbilty() {
            System.out.printf(fmtspabty);
        }
    }


    class Marine2 extends Unit2 implements Unit2Action {

        final String fmtattack = "가우스소총을 이용해서 대상에 %d의 피해를 주고있습니다\n";
        final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다\n";
        final String fmtspabty = "전투자극제를 사용해서 이동속도는 50%% 증가,공격속도도 33%% 증가합니다\n";

        public Marine2() {
            name = "해병대";
            hp = 50;
            power = 30;
            mvspd = 2.95;
            mineral = 50;
            gas = 0;
        }

        @Override
        public void attack() {
            System.out.printf(fmtattack, power);

        }

        @Override
        public void move() {
            System.out.printf(fmtmove, mvspd);

        }

        @Override
        public void specialAbilty() {
            System.out.printf(fmtspabty);

        }
    }

    class Firebat2 extends Unit2 implements Unit2Action {

        final String fmtattack = "화염방사기를 이용해서 대상에 %d의 피해를 주고있습니다\n";
        final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다\n";
        final String fmtspabty = "전투자극제를 사용해서 이동속도는 50% 증가,공격속도도 33% 증가합니다\n";

        public Firebat2() {
            name = "화영방사병";
            hp = 50;
            power = 8 * 2;
            mvspd = 1.875;
            mineral = 50;
            gas = 25;
        }

        @Override
        public void attack() {
            System.out.printf(fmtattack, power);
        }

        @Override
        public void move() {
            System.out.printf(fmtmove, mvspd);
        }

        @Override
        public void specialAbilty() {
            System.out.printf(fmtspabty);
        }
    }
