package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class PushStatus extends Message {
    public static final Integer DEFAULT_STATUS = 0;
    public static final List<PushType> DEFAULT_TYPES = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer status;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<PushType> types;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<PushStatus> {
        public Integer status;
        public List<PushType> types;

        public Builder() {
        }

        public Builder(PushStatus pushStatus) {
            super(pushStatus);
            if (pushStatus == null) {
                return;
            }
            this.status = pushStatus.status;
            this.types = Message.copyOf(pushStatus.types);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PushStatus build(boolean z) {
            return new PushStatus(this, z);
        }
    }

    public PushStatus(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.status;
            if (num == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num;
            }
            List<PushType> list = builder.types;
            if (list == null) {
                this.types = DEFAULT_TYPES;
                return;
            } else {
                this.types = Message.immutableCopyOf(list);
                return;
            }
        }
        this.status = builder.status;
        this.types = Message.immutableCopyOf(builder.types);
    }
}
