package snnu.cs.clock.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @Description TODO
 * @Author sun
 * @Date 2021/6/16 15:24
 */

@Entity
@Table(name = "copy_writing")
@Data
@NoArgsConstructor
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class CopyWriting
{
    // id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // 文案
    private String content;

    public CopyWriting(String content)
    {
        this.content = content;
    }
}
