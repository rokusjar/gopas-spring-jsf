package cz.gopas.repository;

import org.springframework.data.jpa.repository.*;
import cz.gopas.entity.*;

public interface OrderItemRepository extends JpaRepository<OrderedItem, Integer> {

}
