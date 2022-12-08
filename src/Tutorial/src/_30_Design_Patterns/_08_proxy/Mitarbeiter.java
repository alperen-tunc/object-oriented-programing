package Tutorial.src._30_Design_Patterns._08_proxy;

public class Mitarbeiter
{
    private String userName;
    private String password;
    private boolean isLeiter;

    public Mitarbeiter(String userName, String password, boolean isLeiter)
    {
        this.userName = userName;
        this.password = password;
        this.isLeiter = isLeiter;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public boolean isLeiter()
    {
        return isLeiter;
    }

    public void setLeiter(boolean leiter)
    {
        isLeiter = leiter;
    }
}
