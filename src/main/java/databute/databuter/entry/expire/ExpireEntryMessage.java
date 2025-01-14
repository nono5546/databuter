package databute.databuter.entry.expire;

import com.google.common.base.MoreObjects;
import databute.databuter.entry.EntryMessage;
import databute.databuter.network.message.MessageCode;

import java.time.Instant;

import static com.google.common.base.Preconditions.checkNotNull;

public class ExpireEntryMessage implements EntryMessage {

    private final String id;
    private final String key;
    private final Instant expirationTimestamp;

    public ExpireEntryMessage(String id, String key, Instant expirationTimestamp) {
        this.id = checkNotNull(id, "id");
        this.key = checkNotNull(key, "key");
        this.expirationTimestamp = expirationTimestamp;
    }

    @Override
    public MessageCode messageCode() {
        return MessageCode.EXPIRE_ENTRY;
    }

    @Override
    public String id() {
        return id;
    }

    @Override
    public String key() {
        return key;
    }

    public Instant expirationTimestamp() {
        return expirationTimestamp;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("messageCode", messageCode())
                .add("id", id)
                .add("key", key)
                .add("expirationTimestamp", expirationTimestamp)
                .toString();
    }
}
