package snnu.cs.clock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import snnu.cs.clock.entity.ClockUser;

/**
 * @Description TODO
 * @Author sun
 * @Date 2021/6/5 22:01
 */

@Component
@Transactional
public interface UserDao extends JpaRepository<ClockUser, String>
{
}
