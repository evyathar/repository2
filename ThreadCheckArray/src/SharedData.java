public class SharedData 
{
	//dddd
	private ArrayNum<Integer> array;// Changed int[] to ArrayNum<Integer>  
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	public SharedData(ArrayNum<Integer> array, int b) { //change the signature of the method from int[] to ArrayNum<Integer
		
		this.array = array;
		this.b = b;
	}

	public boolean[] getWinArray() 
	{
		return winArray;
	}

	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	public ArrayNum<Integer> getArray() // Updated return type from int[] to ArrayNum<Integer>
    {
        return array;
    }
	
	public int getB() 
	{
		return b;
	}

	public boolean getFlag() 
	{
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
