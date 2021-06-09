package snnu.cs.clock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import snnu.cs.clock.dao.RecordDao;
import snnu.cs.clock.entity.ClockRecord;
import snnu.cs.clock.response.BaseResponse;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @Description TODO
 * @Author sun
 * @Date 2021/6/5 22:21
 */

@RestController
@RequestMapping("/api/record")
public class RecordController
{
    @Autowired
    private RecordDao dao;
    @Value("${qr-code.in}")
    private String codeIn;
    @Value("${qr-code.out}")
    private String codeOut;

    @PostMapping("/add")
    public BaseResponse setRecord(@RequestBody ClockRecord record, HttpServletRequest request)
    {
        String code = request.getHeader("Authorization");
        if (StringUtils.hasText(code))
        {
            record.setDate(new Date());
            if (code.equals(codeIn))
            {
                record.setAction("in");
            }
            else if (code.equals(codeOut))
            {
                record.setAction("out");
            }
            else
            {
                return new BaseResponse("fail", "Token Error.");
            }
            dao.saveAndFlush(record);
            return new BaseResponse("success", "Clock " + record.getAction());
        }
        return new BaseResponse("fail", "Token Error.");
    }
}
