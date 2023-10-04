package exercise;

import java.io.Serial;

/**
 * ClassName: EcDef
 * Description:
 *
 * @author Ignorant
 * @create 2023/10/4 13:13
 */
public class EcDef extends Exception{
    @Serial
    private static final long serialVersionUID = -1671001841893445648L;

    public EcDef() {}

    public EcDef(String message) {
        super(message);
    }
}
