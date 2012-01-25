package net.citizensnpcs.api.npc.trait;

/**
 * Represents an object that can produce objects of a given type. Factories are
 * linked to a name, and produce objects on demand.
 * 
 * @param <T>
 *            The type of objects this will produce
 */
public interface InstanceFactory<T> {
    public abstract T getInstance(String name);

    public abstract void register(String name, Class<? extends T> clazz);

    public abstract void registerWithFactory(String name, Factory<? extends T> factory);
}