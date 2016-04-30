package org.apache.cassandra.node;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.cassandra.dht.Token;

@SuppressWarnings("rawtypes")
public class RingNode implements Serializable {
    private static final long serialVersionUID = 8351368757758010586L;

//    private Map<Token, String> rangeMap;
    private Map<String, String> rangeMap;
    private List<String> ranges;
    private List<String> liveNodes;
    private List<String> deadNodes;
    private Map<String, String> loadMap;

    /**
     * @return the rangeMap
     */
    public Map<String, String> getRangeMap() {
        return rangeMap;
    }

    /**
     * @param map the rangeMap to set
     */
    public void setRangeMap(Map<String, String> map) {
        this.rangeMap = map;
    }

    /**
     * @return the ranges
     */
    public List<String> getRanges() {
        return ranges;
    }

    /**
     * @param ranges the ranges to set
     */
    public void setRanges(List<String> ranges) {
        this.ranges = ranges;
    }

    /**
     * @return the liveNodes
     */
    public List<String> getLiveNodes() {
        return liveNodes;
    }

    /**
     * @param liveNodes the liveNodes to set
     */
    public void setLiveNodes(List<String> liveNodes) {
        this.liveNodes = liveNodes;
    }

    /**
     * @return the deadNodes
     */
    public List<String> getDeadNodes() {
        return deadNodes;
    }

    /**
     * @param deadNodes the deadNodes to set
     */
    public void setDeadNodes(List<String> deadNodes) {
        this.deadNodes = deadNodes;
    }

    /**
     * @return the loadMap
     */
    public Map<String, String> getLoadMap() {
        return loadMap;
    }

    /**
     * @param loadMap the loadMap to set
     */
    public void setLoadMap(Map<String, String> loadMap) {
        this.loadMap = loadMap;
    }
}
