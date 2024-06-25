package com.medicdefense.backend.profiles.domain.services;

import com.medicdefense.backend.profiles.domain.model.aggregate.MedicStudent;
import com.medicdefense.backend.profiles.domain.model.entities.University;
import com.medicdefense.backend.profiles.domain.model.queries.*;

import java.util.List;
import java.util.Optional;

public interface MedicStudentQueryService {
    Optional<MedicStudent> handle(GetMedicStudentByMedicDefenseRecordIdQuery query);
    Optional<MedicStudent> handle(GetMedicStudentByProfileIdQuery query);
    List<MedicStudent> handle(GetAllMedicStudentsQuery query);
    Optional<University> handle(GetUniversityByMedicStudentIdAndNameQuery query);
}
