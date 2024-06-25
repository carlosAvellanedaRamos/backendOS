package com.medicdefense.backend.iam.domain.services;

import com.medicdefense.backend.iam.domain.model.aggregates.User;
import com.medicdefense.backend.iam.domain.model.commands.AddANewLawyerCommand;
import com.medicdefense.backend.iam.domain.model.commands.SignInCommand;
import com.medicdefense.backend.iam.domain.model.commands.SignUpCommand;
import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.Optional;

public interface UserCommandService {
    Optional<User> handle(SignUpCommand command);
    Optional<User> handle(AddANewLawyerCommand command);
    Optional<ImmutablePair<User, String>> handle(SignInCommand command);
}
