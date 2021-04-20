package tbclient.AddPollPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_OPTIONS = "";
    @ProtoField(tag = 3)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69322common;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String options;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long thread_id;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_FORUM_ID = 0L;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69323common;
        public Long forum_id;
        public String options;
        public Long thread_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.thread_id = dataReq.thread_id;
            this.options = dataReq.options;
            this.f69323common = dataReq.f69322common;
            this.forum_id = dataReq.forum_id;
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
            Long l = builder.thread_id;
            if (l == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l;
            }
            String str = builder.options;
            if (str == null) {
                this.options = "";
            } else {
                this.options = str;
            }
            this.f69322common = builder.f69323common;
            Long l2 = builder.forum_id;
            if (l2 == null) {
                this.forum_id = DEFAULT_FORUM_ID;
                return;
            } else {
                this.forum_id = l2;
                return;
            }
        }
        this.thread_id = builder.thread_id;
        this.options = builder.options;
        this.f69322common = builder.f69323common;
        this.forum_id = builder.forum_id;
    }
}
