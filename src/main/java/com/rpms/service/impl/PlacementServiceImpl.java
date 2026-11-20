
package com.rpms.service.impl;

import com.rpms.dao.PlacementDAO;
import com.rpms.dao.impl.PlacementDAOImpl;
import com.rpms.model.Placement;
import com.rpms.service.PlacementService;

import java.util.List;

public class PlacementServiceImpl implements PlacementService {

    private PlacementDAO placementDAO = new PlacementDAOImpl();

    @Override
    public boolean addPlacement(Placement placement) {
        return placementDAO.addPlacement(placement);
    }

    @Override
    public Placement getPlacementById(int id) {
        return placementDAO.getPlacementById(id);
    }

    @Override
    public List<Placement> getAllPlacements() {
        return placementDAO.getAllPlacements();
    }

    @Override
    public boolean updatePlacement(Placement placement) {
        return placementDAO.updatePlacement(placement);
    }

    @Override
    public boolean deletePlacement(int id) {
        return placementDAO.deletePlacement(id);
    }
}
