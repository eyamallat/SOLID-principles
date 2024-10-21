package com.directi.training.ocp.exercise_refactored;



public abstract class Resource {
    public abstract int allocate();
    
    public abstract void free(int resourceId);
    

    public abstract void markFree(int resourceId);
   

    public abstract void markBusy(int resourceId);
   
    public abstract int findFree();
   

   


    
}
