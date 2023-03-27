package utils;

/**
 *
 * @author michelle
 */
public class DynamicArrayList
{
    private static String[] data;
    private int size;
    public final static int intial_capacity = 10;

    public DynamicArrayList()
    {
        data = new String[intial_capacity];
        size = 0;


    }

    // contructor
    public DynamicArrayList(int capacity)
    {
        if (capacity <= 0)
        {
            throw new IllegalArgumentException();
        }
        data = new String[capacity];
        size = 0;
    }

    /**
     * Returns the size of the collection.
     *
     * @return the size of the collection
     */
    public int size()
    {
        return size;
    }


    public String get(int index)
    {
        if (index < 0 || index >= size)
        {
            //if the condition is invalade throw IndexOutOfBounds exception
            throw new IndexOutOfBoundsException("Illegal position");
        }
        //if the position is valid return the array in that current position
        return data[index];

    }
    /**
     * Finds the index of the given value in the data array.
     *
     * @param value The value to search for in the data array.
     * @return The index of the value if it is found, -1 otherwise.
     */
    public int indexOf(String value){
        // Loop through the data array
        for(int i = 0; i < size; i++){
            // Check if the current value in the data array matches the given value
            if(data[i].equals(value)){
                // Return the index if found
                return i;
            }
        }
        // Return -1 if the value is not found in the data array
        return -1;
    }

    /**
     *
     *  Increases the size of the data array by 2 .
     * This method is used when the current data array becomes full and more space is needed.
     */
    private void grow()
    {
        // Create a new, larger data array with twice the size of the original array
        String[] larger = new String[data.length * 2];

        // Copy the values from the original data array to the larger array
        for (int i = 0; i < data.length; i++)
        {
            larger[i] = data[i];
        }
        // Assign the reference of the larger array to the `data` variable
        data = larger;
    }


    /**
     * Adds a value to the data array.
     * If the current data array is full, the size of the array is increased before the value is added.
     *
     * @param value The value to be added to the data array.
     * @return `true` if the value is successfully added to the data array, `false` otherwise.
     */
    public boolean add(String value)
    {
        // Check if the current data array is full
        if (size < data.length)
        {
            // Add the value to the data array if there is room
            data[size] = value;
        } else
        {
            // Increase the size of the data array if it is full
            grow();
            // Add the value to the data array after it has been resized
            data[size] = value;
        }
        // Increment the size of the data array
        size++;
        // Return true to indicate that the value was successfully added to the data array
        return true;
    }
    /**
     * Replaces the value at the specified position in the data array with a new value.
     *
     * @param pos The position of the value to be replaced.
     * @param word The new value to be stored in the data array.
     * @return The value that was previously at the specified position in the data array.
     * @throws IndexOutOfBoundsException If the specified position is not within the bounds of the data array.
     */
    public String set(int pos, String word){
        // Store the original value at the specified position
        String tempw = null;
        // Check if the specified position is within the bounds of the data array
        if(pos >= size || pos < 0){
            // Throw an exception if the specified position is not within the bounds of the data array
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
        }else {
            // Find the value at the specified position
            for(int i = 0; i < size;i++){
                if(pos == i){
                    tempw = data[i];
                }
            }
        }
        // Replace the value at the specified position with the new value
        data[pos] = word;
        // Return the original value at the specified position
        return tempw;
    }


    /**
     * Removes all occurrences of the specified value from the data array.
     *
     * @param value The value to be removed from the data array.
     * @return `true` if at least one occurrence of the specified value was found and removed, `false` otherwise.
     */
    public boolean removeAll(String value) {
        // Counter for the new size of the data array after removing the specified value
        int newSize = 0;
        // Flag to indicate if the specified value was found and removed
        boolean done = false;
        // Loop through the data array to check for occurrences of the specified value
        for (int i = 0; i < size; i++) {
            // Store only the values that do not equal the specified value
            if (!data[i].equals(value)) {
                data[newSize++] = data[i];
            } else {
                // Set the done flag if an occurrence of the specified value was found and removed
                done = true;
            }
        }
        // Update the size of the data array to reflect the removed values
        size = newSize;
        // Return the done flag
        return done;
    }

    /**
     * Checks if the data array is empty.
     *
     * @return `true` if the data array is empty, `false` otherwise.
     */
    public boolean isEmpty(){
        // Return `true` if the size of the data array is less than or equal to 0, `false` otherwise
        return size <= 0;
    }
}
