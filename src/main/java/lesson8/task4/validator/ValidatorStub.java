package lesson8.task4.validator;

import lesson8.task4.entities.Entity;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class ValidatorStub {

    private static final Set<Entity> entities = new HashSet<>();

    public static void validateEntity(Entity entity) {
        System.out.printf("Объект до валидации: %s", entity);
        if (entities.contains(entity)) {
            for (Entity stubEntity : entities) {
                if (stubEntity.equals(entity)) {
                    String uuid = stubEntity.getUuid();
                    entity.setUuid(uuid);
                    break;
                }
            }
        } else {
            String uuid = UUID.randomUUID().toString();
            entity.setUuid(uuid);
            entities.add(entity);
        }
        System.out.printf("Объект после валидации: %s%n", entity);
    }

}
