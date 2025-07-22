package thrivecodestudio.thrive.thriveapp.SessionStorage.Impl;

import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractInMemoryCacheAdapter {
    protected ConcurrentHashMap<Byte, SessionData> inMemoryKVstore; 

    public AbstractInMemoryCacheAdapter() {
        this.inMemoryKVstore = new ConcurrentHashMap<>();
    }

    public abstract void storeData(final Byte key, final SessionData value);

    public abstract void deleteKVPairs(final Byte key);

    public abstract SessionData searchKVPairs(final Byte key);

    // TODO => add specific fetching operations
}
