package de.effectivetrainings;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author martindilger
 *         Date: 06.01.13
 *         Time: 17:21
 */
public class LicenseAvailableValidator implements ConstraintValidator<LicenseAvailable,License>{

    @Override
    public void initialize(LicenseAvailable constraintAnnotation) {
    }

    @Override
    public boolean isValid(License license, ConstraintValidatorContext context) {
       return license.isAvailable();
    }
}
