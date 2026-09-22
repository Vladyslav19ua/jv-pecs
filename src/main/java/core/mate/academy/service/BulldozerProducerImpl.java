package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldozers = new ArrayList<>();

    @Override
    public List<Bulldozer> get() {
        bulldozers.add(new Bulldozer());
        return bulldozers;
    }
}
