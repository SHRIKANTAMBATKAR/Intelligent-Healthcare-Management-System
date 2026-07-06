package com.hospital.hsm.entity;

import com.hospital.hsm.entity.type.bloodgrouptype;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@ToString
@Data
@Setter
@Getter
@Table(
        name= "patient",
        uniqueConstraints = {
                @UniqueConstraint(name = "unique_email", columnNames = {"email"}),
                @UniqueConstraint(name = "unique_patient_name_birthdate", columnNames = {"name","birthdate"})
        },
        indexes = {
                @Index(name="idx_patient_birthdate", columnList = "birthdate")
        }
)
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "name", nullable = false, length = 50)
    private String name;

    @Column(unique = true)
    private String email;

    private String gender;

    @Enumerated(EnumType.STRING)
    private bloodgrouptype bloodgroup;

    @ToString.Exclude
    private LocalDate birthdate;

    @CreationTimestamp
    private LocalDateTime createAt;

    @OneToOne(cascade = {CascadeType.ALL}, orphanRemoval = true)
    @JoinColumn(name = "patient_insurance_id") // owning side
    private Insurance insurance;


    @OneToMany(mappedBy = "patient", cascade = {CascadeType.REMOVE}, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Appointment> appointments = new ArrayList<>();
}
