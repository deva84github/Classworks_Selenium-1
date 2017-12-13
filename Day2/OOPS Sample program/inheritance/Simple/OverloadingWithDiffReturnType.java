package inheritance;

// shows that overloading cares about type and number of arguments. These must be different

public class OverloadingWithDiffReturnType {

	public int abc()
	{
		return 1;
	}
	
	public String abc()
	{
		return "";
	}
}
