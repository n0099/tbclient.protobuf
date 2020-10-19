package tbclient.GetRecommendGod;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes24.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_USER_ID = 0L;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f5248common;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long user_id;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f5248common = builder.f5249common;
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
                return;
            } else {
                this.user_id = builder.user_id;
                return;
            }
        }
        this.f5248common = builder.f5249common;
        this.user_id = builder.user_id;
    }

    /* loaded from: classes24.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f5249common;
        public Long user_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f5249common = dataReq.f5248common;
                this.user_id = dataReq.user_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
