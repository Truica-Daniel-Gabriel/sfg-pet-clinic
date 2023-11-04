package springframework.sfgpetclinic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
//@Builder
@Entity
@Table(name = "speciality")
public class Speciality extends BaseEntity{

    @Column(name = "description")
    private String description;
}
