package kz.kaznu.bauka.dz_6;

import kz.kaznu.bauka.dz_6.interfaces.Transport;

public class Car implements Transport {

    @Override
    public boolean move (int diastance , Terrain terrain){
        return true;
    }
}
