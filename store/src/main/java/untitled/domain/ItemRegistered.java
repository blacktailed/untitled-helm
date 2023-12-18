package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ItemRegistered extends AbstractEvent {

    private Long id;
    private String name;
    private String type;
    private Money price;

    public ItemRegistered(Item aggregate) {
        super(aggregate);
    }

    public ItemRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
