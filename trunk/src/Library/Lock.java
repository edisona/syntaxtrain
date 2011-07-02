package Library;

public class Lock
{
	private boolean isTaken;
	
	public Lock()
	{
		isTaken = false;
	}
	
	public synchronized void P()
	{
		while( isTaken )
		{
			try {
				wait();
			} catch (InterruptedException e)
			{
			}
		}
		isTaken = true;
	}
	
	public synchronized void V()
	{
		isTaken = false;
		notify();
	}
}
