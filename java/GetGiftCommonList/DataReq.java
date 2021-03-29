package tbclient.GetGiftCommonList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_TIMESTAMP = 0;
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f68426common;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer timestamp;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f68427common;
        public Integer timestamp;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.timestamp = dataReq.timestamp;
            this.f68427common = dataReq.f68426common;
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
            Integer num = builder.timestamp;
            if (num == null) {
                this.timestamp = DEFAULT_TIMESTAMP;
            } else {
                this.timestamp = num;
            }
            this.f68426common = builder.f68427common;
            return;
        }
        this.timestamp = builder.timestamp;
        this.f68426common = builder.f68427common;
    }
}
