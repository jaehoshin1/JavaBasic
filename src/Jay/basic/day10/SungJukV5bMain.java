package Jay.basic.day10;

import Jay.basic.sungjuk.SungJukService;
import Jay.basic.sungjuk.SungJukServiceImpl;
import Jay.basic.sungjuk.SungJukVO;


public class SungJukV5bMain {
    public static void main(String[] args) {
        //SungJukService sjsrv = new SungJukServiceImpl();
        SungJukService sjsrv = SungJukServiceImpl.getInstance();

        SungJukVO sj = sjsrv.readSungJuk();
        sjsrv.computeSungJuk(sj);
        sjsrv.printSungJuk(sj);

    }
}
