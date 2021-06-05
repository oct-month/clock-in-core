package snnu.cs.clock.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Description TODO
 * @Author sun
 * @Date 2021/6/5 21:55
 */

@Entity
@Data
@NoArgsConstructor
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class ClockUser
{
    // 学号
    @Id
    private String schoolCode;

    // 姓名
    private String name;

    // 班级名
    private String className;
}
