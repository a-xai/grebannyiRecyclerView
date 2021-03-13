package com.example.grebannyirecyclerview;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    public static Storage shared = new Storage();

    ArrayList<ItemModel> list = new ArrayList<>();

    public Storage() {
        list.add(new ItemModel("kairat", "709089032"));
        list.add(new ItemModel("kairat", "709089032"));
        list.add(new ItemModel("kairat", "709089032"));
        list.add(new ItemModel("kairat", "709089032"));
    }
}
