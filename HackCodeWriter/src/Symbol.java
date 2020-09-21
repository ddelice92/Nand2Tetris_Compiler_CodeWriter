
public class Symbol
{
	String name, type, kind;
	
	public Symbol(String name, String type, String kind)
	{
		this.name = name;
		this.type = type;
		this.kind = kind;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getType()
	{
		return type;
	}
	
	public String getKind()
	{
		return kind;
	}
}
