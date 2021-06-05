package snnu.cs.clock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import snnu.cs.clock.dao.RecordDao;
import snnu.cs.clock.entity.ClockRecord;
import snnu.cs.clock.response.BaseResponse;

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

    @PostMapping("/add")
    public BaseResponse setRecord(@RequestBody ClockRecord record)
    {
        // TODO Authorization 验证
        record.setDate(new Date());
        dao.saveAndFlush(record);
        return new BaseResponse("success");
    }
}
