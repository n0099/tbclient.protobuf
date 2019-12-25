package tbclient.QueryBlockAndAppealInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes6.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_USER_ID = 0L;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1158common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long user_id;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1158common = builder.f1159common;
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
                return;
            } else {
                this.user_id = builder.user_id;
                return;
            }
        }
        this.f1158common = builder.f1159common;
        this.user_id = builder.user_id;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1159common;
        public Long user_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1159common = dataReq.f1158common;
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
