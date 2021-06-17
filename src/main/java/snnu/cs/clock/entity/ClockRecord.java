package snnu.cs.clock.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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

    // 时间
    private Date date;

    // 动作（进入/离开）
    private String action;

    @Transient
    private String schoolCode;

    @ManyToOne(targetEntity = ClockUser.class)
    @JoinColumn(name = "school_code")
    private ClockUser user;
}
