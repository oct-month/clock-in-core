package snnu.cs.clock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import snnu.cs.clock.dao.UserDao;
import snnu.cs.clock.entity.ClockUser;
import snnu.cs.clock.response.BaseResponse;

import javax.validation.Valid;
import java.util.Optional;

/**
 * @Description TODO
 * @Author sun
 * @Date 2021/6/5 22:02
 */

@Validated
@RestController
@RequestMapping("/api/account")
public class UserController
{
    @Autowired
    private UserDao dao;

    @PostMapping("/register")
    public BaseResponse register(@Valid @RequestBody ClockUser user)
    {
        Optional<ClockUser> inUser = dao.findById(user.getSchoolCode());
        if (!inUser.isPresent())
        {
            dao.saveAndFlush(user);
            return new BaseResponse("success");
        }
        return new BaseResponse("fail", "User Has Been Registered yet");
    }

    @PostMapping("/login")
    public BaseResponse login(@Valid @RequestBody ClockUser user)
    {
        Optional<ClockUser> inUser = dao.findById(user.getSchoolCode());
        if (inUser.isPresent())
        {
            return new BaseResponse("success");
        }
        return new BaseResponse("fail", "User Has not Registered yet");
    }
}
