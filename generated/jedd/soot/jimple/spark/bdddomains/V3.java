package soot.jimple.spark.bdddomains;

import jedd.*;

public class V3 extends PhysicalDomain {
    public int bits() { return 20; }
    
    public static PhysicalDomain v() { return instance; }
    
    private static PhysicalDomain instance = new V3();
    
    public V3() { super(); }
}
