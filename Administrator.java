public class Administrator extends Person
{
	public Administrator (String firstname, String lastname, String tempUserName, String tempPassword)
	{
		super(firstname, lastname);
		username = tempUserName;
	}
	public String getUsername()
	{
		return username;
	}
	public String getPassword()
	{
		return password;
	}
	private String username;
	private String password;
}
