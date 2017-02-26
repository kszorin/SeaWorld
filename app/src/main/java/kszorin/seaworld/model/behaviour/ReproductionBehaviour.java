package kszorin.seaworld.model.behaviour;

import kszorin.seaworld.model.Animal;
import kszorin.seaworld.model.Position;
import kszorin.seaworld.view.PlayingWorldView;

import java.util.List;

public interface ReproductionBehaviour {
    void reproduct (Animal animal, PlayingWorldView playingWorldView, List<Position> foundPositionsInEnvirons);
}
