import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimulationTest {

    @Test
    void runSimulation() {

        Simulation sim = new Simulation(2, 100);
        sim.runSimulation();

        sim.result();

    }

    @Test
    void result() {
    }
}