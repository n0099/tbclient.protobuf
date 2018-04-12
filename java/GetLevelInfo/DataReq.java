package tbclient.GetLevelInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes3.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_FORUM_ID = 0L;
    @ProtoField(tag = 2)
    public final CommonReq common;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long forum_id;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            this.common = builder.common;
            return;
        }
        this.forum_id = builder.forum_id;
        this.common = builder.common;
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public Long forum_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.forum_id = dataReq.forum_id;
                this.common = dataReq.common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}