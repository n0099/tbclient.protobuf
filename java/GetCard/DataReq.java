package tbclient.GetCard;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes10.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_PROPS_ID = 0L;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1176common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long props_id;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1177common;
        public Long props_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1177common = dataReq.f1176common;
            this.props_id = dataReq.props_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1176common = builder.f1177common;
            Long l = builder.props_id;
            if (l == null) {
                this.props_id = DEFAULT_PROPS_ID;
                return;
            } else {
                this.props_id = l;
                return;
            }
        }
        this.f1176common = builder.f1177common;
        this.props_id = builder.props_id;
    }
}
