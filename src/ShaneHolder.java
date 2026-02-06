public class ShaneHolder {

    //I added this in GitHUb to be pulled
    //I Fixed a spelling mistake of added, it was addede on GitHub

    private String[] bucket;
    private int size;

    public ShaneHolder() {
        bucket = new String[10];
        size = 0;
    }

    public void addToBucketKirby(String addedString){
        if(size < bucket.length){
            bucket[size] = addedString;
            size++;
        }
        else{
            String[] newBucket = new String[bucket.length*2];
            System.arraycopy(bucket, 0, newBucket, 0, bucket.length);
            newBucket[size] = addedString;
            size++;
            bucket = newBucket;
        }
    }

    public String getPos(int position){
        if(position < size){
            return bucket[position];
        }
        else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void clear(){
        bucket = new String[size];
        size = 0;
    }

    public void printer(){
        System.out.print("[" + bucket[0]);
        for(int i = 1; i < size; i++){
            System.out.print(", " + bucket[i]);
        }
        System.out.println("]");
    }

    public void removePos(int position){
        if(position < size){
            for(int i = position; i < size-1; i++){
                bucket[i] = bucket[i+1];
            }
            size--;
        }
        else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void addPos(int position, String addedString) {
        if (size >= bucket.length) {
            String[] newBucket = new String[bucket.length * 2];
        }

        if (position < size) {
            String tempHolder = bucket[position];
            bucket[position] = addedString;
            for (int x = position + 1; x < size - 1; x++) {
                String nextTempHolder = bucket[x];
                bucket[x] = tempHolder;
                tempHolder = nextTempHolder;
            }
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public ShaneHolder cloneClass(){
        ShaneHolder clonedHolder = new ShaneHolder();
        String[] cloneBucket = new String[bucket.length];
        System.arraycopy(bucket, 0, cloneBucket, 0, bucket.length);
        clonedHolder.setBucket(cloneBucket);
        clonedHolder.setSize(size);
        return clonedHolder;
    }

    public void replace(int position, String newString){
        if(position < size){
            bucket[position] = newString;
        }
        else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    public String[] getBucket(){
        return bucket;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int size() {
        return size;
    }

    public void setBucket(String[] inputArray){
        bucket = inputArray;
    }


}
