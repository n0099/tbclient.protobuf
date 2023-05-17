package tbclient.UpdateTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ResData extends Message {
    public static final Long DEFAULT_TAILID = 0L;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long tailId;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ResData> {
        public Long tailId;

        public Builder() {
        }

        public Builder(ResData resData) {
            super(resData);
            if (resData == null) {
                return;
            }
            this.tailId = resData.tailId;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ResData build(boolean z) {
            return new ResData(this, z);
        }
    }

    public ResData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.tailId;
            if (l == null) {
                this.tailId = DEFAULT_TAILID;
                return;
            } else {
                this.tailId = l;
                return;
            }
        }
        this.tailId = builder.tailId;
    }
}
