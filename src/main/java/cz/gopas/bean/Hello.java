package cz.gopas.bean;

import javax.faces.bean.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

//@ManagedBean
@Component
@Scope("request")
public class Hello {

    public String getWorld() {
        return "Hello world from Spring Bean!";
    }
}
