package tbclient.Share;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static final Long DEFAULT_TID = 0L;
    @ProtoField(tag = 2)
    public final StarContri contri;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long tid;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public StarContri contri;
        public Long tid;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.tid = dataRes.tid;
            this.contri = dataRes.contri;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
            }
            this.contri = builder.contri;
            return;
        }
        this.tid = builder.tid;
        this.contri = builder.contri;
    }
}
