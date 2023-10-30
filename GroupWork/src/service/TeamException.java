package service;

import java.io.Serial;

/**
 * ClassName: TeamException
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/30 20:45
 */
public class TeamException extends Exception{
    @Serial
    private static final long serialVersionUID = 6790586181892940930L;

    public TeamException() {}
    public TeamException(String message) {
        super(message);
    }
}
