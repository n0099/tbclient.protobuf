package tbclient.ActivityPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class ActivityPageResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ActivityPageResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ActivityPageResIdl activityPageResIdl) {
            super(activityPageResIdl);
            if (activityPageResIdl == null) {
                return;
            }
            this.error = activityPageResIdl.error;
            this.data = activityPageResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActivityPageResIdl build(boolean z) {
            return new ActivityPageResIdl(this, z);
        }
    }

    public ActivityPageResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }
}
