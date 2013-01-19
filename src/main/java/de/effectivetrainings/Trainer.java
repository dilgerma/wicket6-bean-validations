package de.effectivetrainings;

import javax.validation.GroupSequence;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.groups.Default;
import java.io.Serializable;
import java.util.Date;

public class Trainer implements Serializable {

    @NotNull
    private String name;

    @Pattern(message = "{email.invalid}",
            regexp = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*((\\.[A-Za-z]{2,}){1}$)")
    @NotNull
    private String email;

    @Pattern(message = "{phone.invalid}",regexp = "[0-9]+")
    private String phone;

    @Past(message = "{birthDay.invalid}")
    @NotNull
    private Date birthDay;

    @LicenseValid(message = "{license.invalid}",groups = ExtendedValidation.class)
    @LicenseAvailable(message = "{license.unavailable}")
    @NotNull
    private License license;

    public Trainer(String name, String email, String phone, Date birthDay) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.birthDay = birthDay;
    }

    public Trainer(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }
}
