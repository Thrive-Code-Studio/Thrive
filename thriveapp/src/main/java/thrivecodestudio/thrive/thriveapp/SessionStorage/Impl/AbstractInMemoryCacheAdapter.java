package thrivecodestudio.thrive.thriveapp.SessionStorage.Impl;

import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractInMemoryCacheAdapter {
    protected ConcurrentHashMap<Long, SessionData> inMemoryKVstore; 

    public AbstractInMemoryCacheAdapter() {
        this.inMemoryKVstore = new ConcurrentHashMap<>();
    }

    public abstract void storeData(final Long key, final SessionData value);

    public abstract void deleteKVPairs(final Long key);

    public abstract SessionData searchKVPairs(final Long key);

    // TODO => add specific fetching operations
}
