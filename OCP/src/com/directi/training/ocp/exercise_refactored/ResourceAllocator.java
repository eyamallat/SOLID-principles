package com.directi.training.ocp.exercise_refactored;


public class ResourceAllocator {

    public int allocate(Resource resource)
    {
        return resource.allocate();
    }

    public void free(Resource resource,int resourceId)
    {
        resource.free(resourceId);
       
    }
    public void markFree(Resource resource,int resourceId)
    {
        resource.markFree(resourceId);
    }

    public void markBusy(Resource resource,int resourceId)
    {
        resource.markBusy(resourceId);
    }

    public int findFree(Resource resource)
    {
        return resource.findFree();
        
    }

    
}
