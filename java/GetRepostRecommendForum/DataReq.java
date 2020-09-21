package tbclient.GetRepostRecommendForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes3.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1116common;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1116common = builder.f1117common;
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.content == null) {
                this.content = "";
            } else {
                this.content = builder.content;
            }
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
                return;
            } else {
                this.forum_id = builder.forum_id;
                return;
            }
        }
        this.f1116common = builder.f1117common;
        this.title = builder.title;
        this.content = builder.content;
        this.forum_id = builder.forum_id;
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1117common;
        public String content;
        public Long forum_id;
        public String title;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1117common = dataReq.f1116common;
                this.title = dataReq.title;
                this.content = dataReq.content;
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
