
public class LogMessage {
	private String machineId;
	private String description;
	
	public LogMessage(String message)
	{
		machineId = message.split(":")[0];
		description = message.split(":")[1];
	}
	
	public boolean contains(String keyword)
	{
		if (description.length()==keyword.length())
		{
			return (description.contains(keyword));
		}
		
		if (description.indexOf(keyword)==0)
		{
			return (description.contains(keyword+" "));
		}
		
		if (description.indexOf(keyword)==description.length()-keyword.length())
		{
			return (description.contains(" "+keyword));
		}
		
		else {return description.contains(" "+keyword+" ");}
	}
	
	public String getMachineId()
	{
		return machineId;
	}
	
	public String getDescription()
	{
		return description;
	}
	
}
