package snnu.cs.clock.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description TODO
 * @Author sun
 * @Date 2021/6/5 22:08
 */

@Data
@AllArgsConstructor
public class BaseResponse
{
    private String status;
    private String msg;

    public BaseResponse(String status)
    {
        this.status = status;
    }
}
