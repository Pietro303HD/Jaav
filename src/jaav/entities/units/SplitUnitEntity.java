package jaav.entities.units;

import jaav.entities.units.SplitUnitType;
import arc.util.*;
import mindustry.type.UnitType;
import mindustry.gen.*;

public class SplitUnitEntity extends UnitEntity {
    
    static UnitType splitUnit;
    static int splitAmount;
    
    @Override
    public void killed(){
        super.killed();
        for (int i = 0; i < splitAmount; i++)  {
            Log.info("[jaav] spawned " + splitUnit.name);
            splitUnit.spawn(team, x, y);
        }
    }
    
    @Override
    public void setType(UnitType type){
        super.setType(type);
        splitUnit = ((SplitUnitType)type).splitUnit;
        splitAmount = ((SplitUnitType)type).splitAmount;
    }
    
}