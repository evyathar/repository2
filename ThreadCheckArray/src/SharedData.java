import java.util.ArrayList;

/**
 * * The class represents a data structure that enables 
 * multi threaded updates on an array.
 * @author Evyater
 * @author Lior
 * @version 2.0
 */

//n
public class SharedData 
{
	/**
	 * array – A list of numbers.
	 * b – The target sum to find.
	 * winArray – Marks numbers used in a valid solution.
	 * flag – Stops other threads when a solution is found.
	 */
	private  ArrayList<Integer> array;// Changed int[] to ArrayList<Integer>  
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	
	/**
	 * Constructor for initializing the SharedData object.
	 * @param array An ArrayList of integers to initialize the array field.
	 * @param b An integer value to initialize the b field.
	 */
	public SharedData(ArrayList<Integer> array, int b) { //change the signature of the method from int[] to ArrayList<Integer
		
		this.array = array;
		this.b = b;
	}

	/**
	 * Returns the winArray indicating the win status.
	 * @return A boolean array representing the win status. 
	 * Each element in the array indicates whether a corresponding condition is a win (true) or not (false).
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	
	/**
	 * Sets the winArray to the provided boolean array.
	 * @param winArray A boolean array that will be assigned to the winArray field.
	 * Each element in the array represents the win status for a specific condition.
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * Returns the array field as an ArrayList of integers.
	 * @return An {@code ArrayList<Integer>} representing the array field.
	 */
	public ArrayList<Integer> getArray() // Updated return type from int[] to ArrayList<Integer>
    {
        return array;
    }
	
	/**
	 * Returns the value of the 'b' field.
	 * @return The integer value of the 'b' field.
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * Returns the value of the 'flag' field.
	 * @return The boolean value of the 'flag' field.
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * Sets the value of the 'flag' field.
	 * @param flag A boolean value to set the 'flag' field.
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
