package de.neuefische;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Contact {
    public String contactName;

    public String getName(){
        return contactName;
    }
}
