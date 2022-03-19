import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimulationTest {

    @Test
    void runSimulation() {

        //Given
        int dice = 2;
        int tries = 100;

        Simulation sim = new Simulation(2, 100);
        sim.runSimulation();

        sim.result();

    }

    @Test
    void runSimulation2() {

        //Given
        int dice = 2;
        int tries = 100;

        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation();

        sim.result();

    }

    @Test
    void runSimulation3() {

        //Given
        int dice = 10;
        int tries = 100;

        Simulation sim = new Simulation(dice, tries);
        sim.runSimulation();

        sim.result();

    }

    @Test
    void runSimulation4() {

        //Given
        int dice = 2;
        int tries = 1000000;

        Simulation sim = new Simulation(dice, tries);
        sim.runSimulation();

        sim.result();

    }
}