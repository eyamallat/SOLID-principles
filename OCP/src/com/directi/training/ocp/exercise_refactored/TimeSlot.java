package com.directi.training.ocp.exercise_refactored;

public class TimeSlot extends Resource{
    
    public int allocate()
    {
        int resourceId = findFree();
        markBusy(resourceId);
           
        return resourceId;
    }
    @Override
    public void free(int resourceId)
    {
        markFree(resourceId);
               
    }
    
    @Override
    public void markFree(int resourceId)
    {
    }

    @Override
    public void markBusy(int resourceId)
    {
    }

    @Override
    public int findFree()
    {
        return 0;
    }
    }
    

