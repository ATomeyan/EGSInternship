package homework11;

import java.lang.reflect.Field;

/**
 * @author Artur Tomeyan.
 */
public class Mapper {

    private Mapper() {
        throw new UnsupportedOperationException();
    }

    public static <E, T> T map(E source, Class<T> destinationType) throws InstantiationException, IllegalAccessException {
        if (source == null || destinationType == null) {
            throw new IllegalArgumentException();
        }

        T dto = destinationType.newInstance();
        Field[] sourceField = source.getClass().getDeclaredFields();
        Field[] dtoField = destinationType.getDeclaredFields();

        for (Field dtoF : dtoField) {
            for (Field sourceF : sourceField) {
                if (sourceF.getName().equals(dtoF.getName())) {
                    dtoF.setAccessible(true);
                    sourceF.setAccessible(true);
                    dtoF.set(dto, sourceF.get(source));
                    break;
                }
            }
        }
        return dto;
    }
}