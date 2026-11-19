
package com.rpms.service;

import com.rpms.model.Placement;
import java.util.List;

public interface PlacementService {

    boolean addPlacement(Placement placement);

    Placement getPlacementById(int id);

    List<Placement> getAllPlacements();

    boolean updatePlacement(Placement placement);

    boolean deletePlacement(int id);
}
