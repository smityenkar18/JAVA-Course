// to import mention the -> package_name.class_name 
// every file has this package by-default imported : import java.lang.System;  -> for System.out.println OR by-defualt we have java.util.*;
// To Import all files in a Package, we an do like -> import tools.*;
// .* means -> all files

import java.util.ArrayList;      // package being used for ArrayList
import tools.advancedCalculator; 
import tools.calculator;


public class main {
    public static void main(String[] args) {
        calculator obj = new calculator();
        advancedCalculator obj1 = new advancedCalculator();
        
        ArrayList list = new ArrayList();
        
        
    }
}
