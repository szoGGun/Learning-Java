package com.przemyslawrutkowski;

import java.util.ArrayList;

public interface IMonster<Coffee> {
    ArrayList<Coffee> display();

    void save(ArrayList<Coffee> latte);

    void save(Coffee latte);
}