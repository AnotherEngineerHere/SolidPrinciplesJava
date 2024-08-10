package com.solid.isp; 

import org.junit.jupiter.api.Test;

public class ISPTest {

    @Test
    public void testRobotWorker() {
        Workable robotWorker = new RobotWorker();
        robotWorker.startWork();
        robotWorker.stopWork();
    }

    @Test
    public void testHumanWorker() {
        HumanWorker humanWorker = new HumanWorker();
        humanWorker.startWork();
        humanWorker.startEating();
        humanWorker.stopWork();
    }
}
