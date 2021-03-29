package tbclient.RedNotify;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class RedNotify extends Message {
    public static final Integer DEFAULT_NOTIFY_STATUS = 0;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer notify_status;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<RedNotify> {
        public Integer notify_status;

        public Builder() {
        }

        public Builder(RedNotify redNotify) {
            super(redNotify);
            if (redNotify == null) {
                return;
            }
            this.notify_status = redNotify.notify_status;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RedNotify build(boolean z) {
            return new RedNotify(this, z);
        }
    }

    public RedNotify(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.notify_status;
            if (num == null) {
                this.notify_status = DEFAULT_NOTIFY_STATUS;
                return;
            } else {
                this.notify_status = num;
                return;
            }
        }
        this.notify_status = builder.notify_status;
    }
}
