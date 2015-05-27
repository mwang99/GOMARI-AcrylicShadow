public class Administrator extends Person
{
	public Administrator (String firstname, String lastname, int tempIdNum, String tempUserName, String tempPassword)
	{
		super(firstname, lastname, tempIdNum);
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
