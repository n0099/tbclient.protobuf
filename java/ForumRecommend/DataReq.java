package tbclient.ForumRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes16.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_VISIT_HISTORY = "";
    @ProtoField(tag = 4)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1050common;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer like_forum;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer recommend;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer sort_type;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer topic;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String visit_history;
    public static final Integer DEFAULT_LIKE_FORUM = 0;
    public static final Integer DEFAULT_TOPIC = 0;
    public static final Integer DEFAULT_RECOMMEND = 0;
    public static final Integer DEFAULT_SORT_TYPE = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.like_forum == null) {
                this.like_forum = DEFAULT_LIKE_FORUM;
            } else {
                this.like_forum = builder.like_forum;
            }
            if (builder.topic == null) {
                this.topic = DEFAULT_TOPIC;
            } else {
                this.topic = builder.topic;
            }
            if (builder.recommend == null) {
                this.recommend = DEFAULT_RECOMMEND;
            } else {
                this.recommend = builder.recommend;
            }
            this.f1050common = builder.f1051common;
            if (builder.visit_history == null) {
                this.visit_history = "";
            } else {
                this.visit_history = builder.visit_history;
            }
            if (builder.sort_type == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
                return;
            } else {
                this.sort_type = builder.sort_type;
                return;
            }
        }
        this.like_forum = builder.like_forum;
        this.topic = builder.topic;
        this.recommend = builder.recommend;
        this.f1050common = builder.f1051common;
        this.visit_history = builder.visit_history;
        this.sort_type = builder.sort_type;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1051common;
        public Integer like_forum;
        public Integer recommend;
        public Integer sort_type;
        public Integer topic;
        public String visit_history;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.like_forum = dataReq.like_forum;
                this.topic = dataReq.topic;
                this.recommend = dataReq.recommend;
                this.f1051common = dataReq.f1050common;
                this.visit_history = dataReq.visit_history;
                this.sort_type = dataReq.sort_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
