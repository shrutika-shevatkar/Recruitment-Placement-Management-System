
package com.rpms.controller;

import com.rpms.model.Placement;
import com.rpms.service.PlacementService;
import java.util.List;

public class PlacementController {

    private PlacementService placementService;

    public PlacementController(PlacementService placementService) {
        this.placementService = placementService;
    }

    public boolean addPlacement(Placement placement) {
        return placementService.addPlacement(placement);
    }

    public Placement getPlacement(int id) {
        return placementService.getPlacementById(id);
    }

    public List<Placement> getAllPlacements() {
        return placementService.getAllPlacements();
    }
}
