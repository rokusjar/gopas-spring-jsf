package cz.gopas.repository;

import java.util.*;
import org.springframework.data.jpa.repository.*;
import cz.gopas.entity.*;

public interface ItemRepository extends JpaRepository<Item, Integer> {

    List<Item> findByNameContaining(String name);

    @Query("select i from Item i left join fetch i.orderedItems")
    //@Query(nativeQuery = true, "tady bude klasicke sql")
    List<Item> findAllFetch();
}
