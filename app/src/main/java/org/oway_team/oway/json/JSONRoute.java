package org.oway_team.oway.json;

import java.util.ArrayList;
import java.util.List;

public class JSONRoute {
    public int totalDuration;
    public double totalDistance;
    public JSONRoute() {
        lineStrings = new ArrayList<JSONLineString>();
    }
    public List<JSONLineString> lineStrings;
}
