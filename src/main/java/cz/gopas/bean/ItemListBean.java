package cz.gopas.bean;

import java.util.*;
import javax.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;
import cz.gopas.entity.*;
import cz.gopas.service.*;

@Component
@Scope("request")
public class ItemListBean {

    @Autowired
    ItemService itemService;

    private List<Item> items;

    @PostConstruct
    public void loadItems(){
        items = itemService.getItems();
    }

    public List<Item> getItems(){
        return items;
    }
}
