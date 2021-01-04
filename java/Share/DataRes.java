package tbclient.Share;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static final Long DEFAULT_TID = 0L;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long tid;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tid == null) {
                this.tid = DEFAULT_TID;
                return;
            } else {
                this.tid = builder.tid;
                return;
            }
        }
        this.tid = builder.tid;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Long tid;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.tid = dataRes.tid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
