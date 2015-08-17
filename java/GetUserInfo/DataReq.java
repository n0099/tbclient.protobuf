package tbclient.GetUserInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_UID = 0L;
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long uid;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
            if (builder.uid == null) {
                this.uid = DEFAULT_UID;
                return;
            } else {
                this.uid = builder.uid;
                return;
            }
        }
        this.common = builder.common;
        this.uid = builder.uid;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public Long uid;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.uid = dataReq.uid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
