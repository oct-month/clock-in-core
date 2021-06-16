package snnu.cs.clock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import snnu.cs.clock.entity.CopyWriting;

@Component
@Transactional
public interface CopyWritingDao extends JpaRepository<CopyWriting, Long>
{
    @Query(value = "select * from copy_writing order by RAND() limit 1", nativeQuery = true)
    CopyWriting getRandomOne();
}
