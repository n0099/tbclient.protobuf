package tbclient.Unlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes10.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Integer DEFAULT_TYPE = 0;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1261common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long thread_id;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer type;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1261common = builder.f1262common;
            if (builder.thread_id == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
                return;
            } else {
                this.type = builder.type;
                return;
            }
        }
        this.f1261common = builder.f1262common;
        this.thread_id = builder.thread_id;
        this.type = builder.type;
    }

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1262common;
        public Long thread_id;
        public Integer type;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1262common = dataReq.f1261common;
                this.thread_id = dataReq.thread_id;
                this.type = dataReq.type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
