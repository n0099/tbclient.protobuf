package tbclient.GetBawuInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes23.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_FORUM_ID = 0L;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f4970common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long forum_id;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f4970common = builder.f4971common;
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
                return;
            } else {
                this.forum_id = builder.forum_id;
                return;
            }
        }
        this.f4970common = builder.f4971common;
        this.forum_id = builder.forum_id;
    }

    /* loaded from: classes23.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f4971common;
        public Long forum_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f4971common = dataReq.f4970common;
                this.forum_id = dataReq.forum_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
