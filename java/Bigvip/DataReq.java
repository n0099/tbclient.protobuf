package tbclient.Bigvip;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes25.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_USER_ID = 0L;
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1016common;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            this.f1016common = builder.f1017common;
            return;
        }
        this.user_id = builder.user_id;
        this.f1016common = builder.f1017common;
    }

    /* loaded from: classes25.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1017common;
        public Long user_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.user_id = dataReq.user_id;
                this.f1017common = dataReq.f1016common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
