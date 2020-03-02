package tbclient.Bigvip;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes13.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_USER_ID = 0L;
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1061common;
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
            this.f1061common = builder.f1062common;
            return;
        }
        this.user_id = builder.user_id;
        this.f1061common = builder.f1062common;
    }

    /* loaded from: classes13.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1062common;
        public Long user_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.user_id = dataReq.user_id;
                this.f1062common = dataReq.f1061common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
