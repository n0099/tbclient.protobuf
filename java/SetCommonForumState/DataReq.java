package tbclient.SetCommonForumState;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_OPERATION = 0;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1487common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer operation;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1488common;
        public Long forum_id;
        public Integer operation;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1488common = dataReq.f1487common;
            this.forum_id = dataReq.forum_id;
            this.operation = dataReq.operation;
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
            this.f1487common = builder.f1488common;
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            Integer num = builder.operation;
            if (num == null) {
                this.operation = DEFAULT_OPERATION;
                return;
            } else {
                this.operation = num;
                return;
            }
        }
        this.f1487common = builder.f1488common;
        this.forum_id = builder.forum_id;
        this.operation = builder.operation;
    }
}
