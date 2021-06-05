package snnu.cs.clock.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Description TODO
 * @Author sun
 * @Date 2021/6/5 22:14
 */

@Entity
@Data
@NoArgsConstructor
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class ClockRecord
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    // 学号
    private String schoolCode;
    // 时间
    private Date date;
    // 动作（进入/离开）
    private String action;
}
