package threadMessages;

import java.io.Serializable;

public class GameReadyMessage implements Serializable 
{
	public static final long serialVersionUID = 1;
	private Boolean ready;
	
	public GameReadyMessage(Boolean ready)
	{
		this.ready = ready;
	}
	
	public Boolean getReadyFlag()
	{
		return ready;
	}
}
