package soot.jimple.spark.bdddomains;

import jedd.*;
import soot.*;
import soot.jimple.spark.pag.*;

public class stmt extends Attribute {
    public final STMT domain = (STMT) STMT.v();
    
    public Domain domain() { return domain; }
    
    public static Attribute v() { return instance; }
    
    private static Attribute instance = new stmt();
    
    public stmt() { super(); }
}
