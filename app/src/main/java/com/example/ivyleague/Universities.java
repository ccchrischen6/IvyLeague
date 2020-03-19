package com.example.ivyleague;

import java.util.ArrayList;
import java.util.List;

public class Universities {
    private static List<University> universities = new ArrayList();

    public static void add(University u){
        universities.add(u);
    }

    public static int size(){
        return universities.size();
    }

    public static University get(int n){
        return universities.get(n);
    }
}
