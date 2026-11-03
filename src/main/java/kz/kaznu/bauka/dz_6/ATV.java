package kz.kaznu.bauka.dz_6;

import kz.kaznu.bauka.dz_6.interfaces.Transport;

public class ATV implements Transport {
    int fuel;

    @Override
    public boolean move (int distance , Terrain terrain){
        return true;
    }
}
