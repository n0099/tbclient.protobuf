package tbclient.RelateRecThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_EQID = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1476common;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String eqid;
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

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1477common;
        public String eqid;
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
            this.f1477common = dataReq.f1476common;
            this.forum_id = dataReq.forum_id;
            this.thread_id = dataReq.thread_id;
            this.source_type = dataReq.source_type;
            this.source_from = dataReq.source_from;
            this.eqid = dataReq.eqid;
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
            this.f1476common = builder.f1477common;
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
            } else {
                this.source_from = num2;
            }
            String str = builder.eqid;
            if (str == null) {
                this.eqid = "";
                return;
            } else {
                this.eqid = str;
                return;
            }
        }
        this.f1476common = builder.f1477common;
        this.forum_id = builder.forum_id;
        this.thread_id = builder.thread_id;
        this.source_type = builder.source_type;
        this.source_from = builder.source_from;
        this.eqid = builder.eqid;
    }
}
