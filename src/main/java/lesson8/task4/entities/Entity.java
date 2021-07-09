package lesson8.task4.entities;

import lesson8.task4.validator.ValidatorStub;

public abstract class Entity implements Validatable {

    protected String name;
    protected String uuid;

    public Entity(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public void validate() {
        ValidatorStub.validateEntity(this);
    }
}
