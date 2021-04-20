package tbclient.RelateRecThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69600common;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer source_from;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer source_type;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long thread_id;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Integer DEFAULT_SOURCE_TYPE = 0;
    public static final Integer DEFAULT_SOURCE_FROM = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69601common;
        public Long forum_id;
        public Integer source_from;
        public Integer source_type;
        public Long thread_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f69601common = dataReq.f69600common;
            this.forum_id = dataReq.forum_id;
            this.thread_id = dataReq.thread_id;
            this.source_type = dataReq.source_type;
            this.source_from = dataReq.source_from;
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
            this.f69600common = builder.f69601common;
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            Long l2 = builder.thread_id;
            if (l2 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l2;
            }
            Integer num = builder.source_type;
            if (num == null) {
                this.source_type = DEFAULT_SOURCE_TYPE;
            } else {
                this.source_type = num;
            }
            Integer num2 = builder.source_from;
            if (num2 == null) {
                this.source_from = DEFAULT_SOURCE_FROM;
                return;
            } else {
                this.source_from = num2;
                return;
            }
        }
        this.f69600common = builder.f69601common;
        this.forum_id = builder.forum_id;
        this.thread_id = builder.thread_id;
        this.source_type = builder.source_type;
        this.source_from = builder.source_from;
    }
}
