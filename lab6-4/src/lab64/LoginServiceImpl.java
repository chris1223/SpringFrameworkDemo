package lab64;

public class LoginServiceImpl implements LoginService
{

    public boolean login(String user, String password)
    {

        if ("user".equals(user) && "123".equals(password))
        {
            return true;
        } else
        {
            return false;
        }
    }

}
