
package com.rpms.dao;

import com.rpms.model.Placement;
import java.util.List;

public interface PlacementDAO {

    boolean addPlacement(Placement placement);

    Placement getPlacementById(int placementId);

    List<Placement> getAllPlacements();

    boolean updatePlacement(Placement placement);

    boolean deletePlacement(int placementId);
}
