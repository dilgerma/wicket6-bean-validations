package de.effectivetrainings;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author martindilger
 *         Date: 06.01.13
 *         Time: 17:21
 */
public class LicenseValidator implements ConstraintValidator<LicenseValid,License>{

    @Override
    public void initialize(LicenseValid constraintAnnotation) {
    }

    @Override
    public boolean isValid(License license, ConstraintValidatorContext context) {
        //external systems are so slow..
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            return false;
        }
        return license.isValid();

    }
}
