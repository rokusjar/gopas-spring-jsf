package cz.gopas.repository;

import org.springframework.data.jpa.repository.*;
import cz.gopas.entity.*;

public interface UserOrderRepository extends JpaRepository<UserOrder, Integer> {

}
