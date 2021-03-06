/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.chargingcontroller;
import java.util.*;
/**
 * This is a wrapper class that wraps all the files
 * @author Siyuan Wang
 */
public class ChargingParameters {
    
    private int numOfCells = 0;
    private double vUpper = 0;
    private double iUpper = 0;
    private int tUpper = 0;
    private int bypassDuration = 0;
    private double bypassThreshold = 0; 
    private double bypassCutoff = 0;
    private ArrayList<String> listOfPorts = null;
    private String portToBMS = null;
    private String portToArduino = null;
    private int chargingTime = 0;
    private boolean isAutomaticMode = true;
    private boolean withArduino = false;
    private float[] voltageOffset;
    private float[] temperatureOffset;
    private float currentOffset;
    
    /**
     * Default Constructor
     * 
     * @param _numOfCells
     * @param _vUpper
     * @param _iUpper
     * @param _tUpper
     * @param _bypassDuration
     * @param _bypassThreshold
     * @param _bypassCutoff
     * @param _listOfPorts
     * @param _portToBMS
     * @param _portToArduino 
     */
    public ChargingParameters(  int _numOfCells, double _vUpper, double _iUpper, 
                                int _tUpper, int _bypassDuration,
                                double _bypassThreshold, double _bypassCutoff, 
                                ArrayList<String> _listOfPorts,
                                String _portToBMS, String _portToArduino, int _chargingTime,
                                float[] _voltageOffset, float[] _temperatureOffset, float _currentOffset )
    {
        this.numOfCells = _numOfCells;
        this.vUpper = _vUpper;
        this.iUpper = _iUpper;
        this.tUpper = _tUpper;
        this.bypassDuration = _bypassDuration;
        this.bypassThreshold = _bypassThreshold;
        this.bypassCutoff = _bypassCutoff;
        this.listOfPorts = _listOfPorts;
        this.portToArduino = _portToArduino;
        this.portToBMS = _portToBMS;
        this.chargingTime = _chargingTime;
        this.isAutomaticMode = true;
        this.withArduino = false;
        this.voltageOffset = _voltageOffset;
        this.temperatureOffset = _temperatureOffset;
        this.currentOffset = _currentOffset;
    }
    
    /**
     * Alternative Constructor
     */
    public ChargingParameters(){}
    
    /**
     * setter function to set all the values wrapped by this class
     * 
     * @param _numOfCells
     * @param _vUpper
     * @param _iUpper
     * @param _tUpper
     * @param _bypassDuration
     * @param _bypassCutoff
     * @param _bypassThreshold
     * @param _listOfPorts
     * @param _portToBMS
     * @param _portToArduino 
     * @param _chargingTime
     */
    public void setParameters(  int _numOfCells, double _vUpper, double _iUpper, 
                                int _tUpper, int _bypassDuration, double _bypassCutoff,
                                double _bypassThreshold, ArrayList<String> _listOfPorts,
                                String _portToBMS, String _portToArduino, int _chargingTime )
    {
        this.numOfCells = _numOfCells;
        this.vUpper = _vUpper;
        this.iUpper = _iUpper;
        this.tUpper = _tUpper;
        this.bypassDuration = _bypassDuration;
        this.bypassCutoff = _bypassCutoff;
        this.bypassThreshold = _bypassThreshold;
        this.listOfPorts = _listOfPorts;
        this.portToArduino = _portToArduino;
        this.portToBMS = _portToBMS;
        this.chargingTime = _chargingTime;
    }
    
    /**
     * The following functions are all getters and setters for all of fields in this class
     */
    
    public void setNumOfCells(int _numOfCells)
    {
        this.numOfCells = _numOfCells;
    }

    public int getNumOfCells() 
    {
        return this.numOfCells;
    }
    
    public void setVoltageUpperLimit(double _vUpper)
    {
        this.vUpper = _vUpper;
    }
    
    public double getVoltageUpperLimit()
    {
        return this.vUpper;
    }
    
    
    public void setCurrentUpperLimit(double _iUpper)
    {
        this.iUpper = _iUpper;
    }
    
    public double getCurrentUpperLimit()
    {
        return this.iUpper;
    }
    
    public void setTemperatureUpperLimit(int _tUpper)
    {
        this.tUpper = _tUpper;
    }
    
    public int getTemperatureUpperLimit()
    {
        return this.tUpper;
    }
    
    public void setBypassDuration(int _bypassDuration)
    {
        this.bypassDuration = _bypassDuration;
    }
    public int getBypassDuration()
    {
        return this.bypassDuration;
    }
    
    public void setBypassThreshold(double _bypassThreshold)
    {
        this.bypassThreshold = _bypassThreshold;
    }
    
    public double getBypassThreshold()
    {
        return this.bypassThreshold;
    }
    
    public ArrayList<String> getListOfPorts()
    {
        return this.listOfPorts;
    }
    
    public void setListOfPorts(ArrayList<String> _listOfPorts)
    {
        this.listOfPorts = _listOfPorts;
    }
    
    public String getPortToBMS()
    {
        return this.portToBMS;
    }
    
    public void setPortToBMS(String _portToBMS)
    {
        this.portToBMS = _portToBMS;
    }
    
    public String getPortToArduino()
    {
        return this.portToArduino;
    }
    
    public void setPortToArduino(String _portToArduino)
    {
        this.portToArduino = _portToArduino;
    }
    
    public void setBypassCutoff(double _bypassCutoff)
    {
        this.bypassCutoff = _bypassCutoff;
    }
    
    public double getBypassCutoff()
    {
        return this.bypassCutoff;
    }
    
    public void setChargingTime(int _chargingTime)
    {
        this.chargingTime = _chargingTime;
    }
    
    public int getChargingTime()
    {
        return this.chargingTime;
    }
    
    public void setIsAutomaticMode(boolean _isAutomaticMode)
    {
        this.isAutomaticMode = _isAutomaticMode;
    }
    
    public boolean getIsAutomaticMode()
    {
        return this.isAutomaticMode;
    }
    
    public void setWithArduino(boolean _withArduino)
    {
        this.withArduino = _withArduino;
    }
    
    public boolean getWithArduino()
    {
        return this.withArduino;
    }
    
    public float getVoltageOffset(int index)
    {
        return this.voltageOffset[index];
    }
    
    public void setVoltageOffset(int index, float offset)
    {
        this.voltageOffset[index] = offset;
    }
    
    public float getTemperatureOffset(int index)
    {
        return this.temperatureOffset[index];
    }
    
    public void setTemperatureOffset(int index, float offset)
    {
        this.temperatureOffset[index] = offset;
    }
    
    public float getCurrentOffset()
    {
        return this.currentOffset;
    }
    
    public void setCurrentOffset(float offset)
    {
        this.currentOffset = offset;
    }
            
}
