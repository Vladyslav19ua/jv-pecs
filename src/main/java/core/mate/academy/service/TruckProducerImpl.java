package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Truck> {
    private List<Truck> trucks = new ArrayList<>();

    @Override
    public List<Truck> get() {
        trucks.add(new Truck());
        return trucks;
    }
}
