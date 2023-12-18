package untitled.external;

import java.util.Date;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "store", url = "${api.url.store}")
public interface ItemService {
    @GetMapping(path = "/items")
    public List<Item> getItem();

    @GetMapping(path = "/items/{id}")
    public Item getItem(@PathVariable("id") Long id);
}
