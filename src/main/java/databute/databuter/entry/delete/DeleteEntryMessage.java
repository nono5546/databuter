package databute.databuter.entry.delete;

import com.google.common.base.MoreObjects;
import databute.databuter.entry.EntryMessage;
import databute.databuter.network.message.MessageCode;

import static com.google.common.base.Preconditions.checkNotNull;

public class DeleteEntryMessage implements EntryMessage {

    private final String id;
    private final String key;

    public DeleteEntryMessage(String id, String key) {
        this.id = checkNotNull(id, "id");
        this.key = checkNotNull(key, "key");
    }

    @Override
    public MessageCode messageCode() {
        return MessageCode.DELETE_ENTRY;
    }

    @Override
    public String id() {
        return id;
    }

    @Override
    public String key() {
        return key;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("messageCode", messageCode())
                .add("id", id)
                .add("key", key)
                .toString();
    }
}
