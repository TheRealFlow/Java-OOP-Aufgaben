package de.neuefische;

public class Friend extends Contact {
    private String contactName;
    private int contactNumber;

    @Override
    public String getName() {
        return super.getName();
    }

    public Friend(String contactName, String contactName1, int contactNumber) {
        super(contactName);
        this.contactName = contactName1;
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "contactName='" + getName() + '\'' +
                ", contactNumber=" + contactNumber +
                '}';
    }
}
