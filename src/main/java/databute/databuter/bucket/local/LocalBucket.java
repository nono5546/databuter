package databute.databuter.bucket.local;

import com.google.common.base.MoreObjects;
import databute.databuter.bucket.Bucket;
import databute.databuter.bucket.BucketConfiguration;

public class LocalBucket extends Bucket {

    public LocalBucket(BucketConfiguration configuration) {
        super(configuration);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id())
                .add("configuration", configuration())
                .toString();
    }
}