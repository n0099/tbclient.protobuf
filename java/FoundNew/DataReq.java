package tbclient.FoundNew;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_TIMESTAMP = 0L;
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long timestamp;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
            if (builder.timestamp == null) {
                this.timestamp = DEFAULT_TIMESTAMP;
                return;
            } else {
                this.timestamp = builder.timestamp;
                return;
            }
        }
        this.common = builder.common;
        this.timestamp = builder.timestamp;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public Long timestamp;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.timestamp = dataReq.timestamp;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
