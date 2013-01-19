package de.effectivetrainings;

import javax.validation.GroupSequence;
import javax.validation.groups.Default;

/**
 * @author martindilger
 *         Date: 06.01.13
 *         Time: 18:43
 */
@GroupSequence(value = {Default.class,ExtendedValidation.class})
public interface TrainerGroupSequence {
}
