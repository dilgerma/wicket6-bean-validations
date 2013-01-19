package de.effectivetrainings;

public enum License {
    NONE,EBAY, CERTIFICATION;

    public boolean isValid(){
        return EBAY != this;
    }

    public boolean isAvailable(){
        return NONE != this;
    }
}