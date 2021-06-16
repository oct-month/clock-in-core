package snnu.cs.clock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import snnu.cs.clock.entity.QrCode;

@Component
@Transactional
public interface QrCodeDao extends JpaRepository<QrCode, Long>
{
    @Query("select * from `qr_code` order by `id` desc limit 1")
    QrCode getNewest();
}
