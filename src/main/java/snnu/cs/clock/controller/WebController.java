package snnu.cs.clock.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import snnu.cs.clock.dao.RecordDao;
import snnu.cs.clock.entity.ClockRecord;

import java.util.List;

@Controller
public class WebController
{
    @Autowired
    private RecordDao recordDao;

    @GetMapping("/records")
    public String records(Model model)
    {
        List<ClockRecord> records = recordDao.findAll();
        model.addAttribute("records", records);
        return "records";
    }
}
