import java.util.ArrayList;
import java.util.List;

public class SystemLog {
	private List<LogMessage> messageList;
	
	public List<LogMessage> removeMessage(String keyword)
	{
		List<LogMessage> badList = new ArrayList<LogMessage>();
		for (LogMessage msg : messageList)
		{
			if (msg.contains(keyword))
			{
				messageList.remove(msg);
				badList.add(msg);
			}
		}
		return badList;
	}
}
