package kz.kaznu.bauka.dz_6;

import kz.kaznu.bauka.dz_6.interfaces.Transport;

public class Horse implements Transport {

    @Override
    public boolean move (int distance , Terrain terrain){
        return true;
    }
}
