package soot.jimple.toolkits.pointer;
import java.util.*;
import soot.*;

/** Represents the read or write set of a statement. */
public abstract class RWSet {
    public abstract boolean getCallsNative();
    public abstract boolean setCallsNative();

    /** Returns an iterator over any globals read/written. */
    public abstract Set getGlobals();
    public abstract Set getFields();
    public abstract ObjectSet getBaseForField( Object f );
    public abstract boolean hasNonEmptyIntersection( RWSet other );
    /** Adds the RWSet other into this set. */
    public abstract boolean union( RWSet other );
    public abstract boolean addGlobal( SootField global );
    public abstract boolean addFieldRef( ObjectSet otherBase, Object field );
    public abstract boolean isEquivTo( RWSet other );
}
