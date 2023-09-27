/*
	Note: nevermind the abstract, it's something to help remind you to write the calculateVirtualMemory method in...
	...ALL your subclasses
*/
public abstract class Computer
{

	private String name;
	private int primaryMemory;		// in GB
	private int secondaryMemory;	// in GB

	public Computer(String name, int primaryMemory, int secondaryMemory)
	{
		this.name = name;
		this.primaryMemory   = primaryMemory;
		this.secondaryMemory = secondaryMemory;
	}

	public String getName()
	{
		return this.name;
	}

	public int getPrimaryMemory()
	{
		return this.primaryMemory;
	}

	public int getSecondaryMemory()
	{
		return this.secondaryMemory;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setPrimaryMemory(int primaryMemory)
	{
		this.primaryMemory = primaryMemory;
	}

	public void setSecondaryMemory(int secondaryMemory) {
		this.secondaryMemory = secondaryMemory;
	}

	public abstract double calculateVirtualMemory(); // this is fine

	public String toString()
	{
		String output = "Computer name: " + this.name;
		output = output + "\nRAM in GB: " + this.primaryMemory;
		output = output + "\nSSD in GB: " + this.secondaryMemory;
		return output;
	}

}
