package online.fivediamond.be.model.collection;

import lombok.Data;
import online.fivediamond.be.entity.ProductLine;

import java.util.List;

@Data
public class CollectionCreationRequest {
    List<Long> productLineIds;
    String name;
    String description;
    String imgURL;
}
