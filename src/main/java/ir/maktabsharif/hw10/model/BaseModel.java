package ir.maktabsharif.hw10.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;


@MappedSuperclass
@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BaseModel <ID extends Serializable> implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private ID id;
    @Builder.Default
    private LocalDateTime createdAt = LocalDateTime.now();

}
