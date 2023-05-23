// Bob is a wall painter and he needs your help. 
// You have to write a program that helps Bob calculate how many buckets of paint he needs to buy before going to work. 
// Bob might also have some extra buckets at home. He also knows the area that he can cover with one bucket of paint.
// Bob does not like to enter 0 for the extraBuckets parameter so he needs another method.
// Write another overloaded method named getBucketCount without extraBuckets parameter.

public class PaintJob {
    
    public static int getBucketCount( double width, double height, double areaPerBucket, int extraBuckets ) {
        
        if(width<=0 || height <=0 || areaPerBucket<=0 || extraBuckets<0) {
            return -1;
        }
        double areaToCover = width*height;
        int bucketsNeeded = (int) (areaToCover/areaPerBucket) + 1;
        return (bucketsNeeded-extraBuckets);
        
    }
    
    public static int getBucketCount( double width, double height, double areaPerBucket ) {
        
        return (getBucketCount(width,height,areaPerBucket,0));
        
    }
    
    public static int getBucketCount( double area , double areaPerBucket ) {
        
        if(area<=0 || areaPerBucket<=0)
            return -1;
        
        int bucketsNeeded = (int) (area/areaPerBucket) + 1;
        return bucketsNeeded;
        
    }
        
    
}