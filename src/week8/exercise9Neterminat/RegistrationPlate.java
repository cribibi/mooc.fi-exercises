package week8.exercise9Neterminat;

import java.util.Objects;

public class RegistrationPlate {
    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String regCode, String country) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null){
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) object;
        return this.regCode.equals(compared.regCode) &&
                this.country.equals(compared.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regCode, country);
    }

    public String toString(){
        return country+ " "+regCode;
    }
}
