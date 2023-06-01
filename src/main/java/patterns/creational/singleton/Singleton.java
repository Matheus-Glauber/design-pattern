package patterns.creational.singleton;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public final class Singleton {
    private static Singleton instance;
    @Getter
    private final Object value;

    public static Singleton getInstance(Object value) {
        if (instance == null) {
            instance = new Singleton(value);
        }

        return instance;
    }

}
