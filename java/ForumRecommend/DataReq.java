package tbclient.ForumRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_VISIT_HISTORY = "";
    @ProtoField(tag = 4)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f72608common;
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

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f72609common;
        public Integer like_forum;
        public Integer recommend;
        public Integer sort_type;
        public Integer topic;
        public String visit_history;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.like_forum = dataReq.like_forum;
            this.topic = dataReq.topic;
            this.recommend = dataReq.recommend;
            this.f72609common = dataReq.f72608common;
            this.visit_history = dataReq.visit_history;
            this.sort_type = dataReq.sort_type;
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
            Integer num = builder.like_forum;
            if (num == null) {
                this.like_forum = DEFAULT_LIKE_FORUM;
            } else {
                this.like_forum = num;
            }
            Integer num2 = builder.topic;
            if (num2 == null) {
                this.topic = DEFAULT_TOPIC;
            } else {
                this.topic = num2;
            }
            Integer num3 = builder.recommend;
            if (num3 == null) {
                this.recommend = DEFAULT_RECOMMEND;
            } else {
                this.recommend = num3;
            }
            this.f72608common = builder.f72609common;
            String str = builder.visit_history;
            if (str == null) {
                this.visit_history = "";
            } else {
                this.visit_history = str;
            }
            Integer num4 = builder.sort_type;
            if (num4 == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
                return;
            } else {
                this.sort_type = num4;
                return;
            }
        }
        this.like_forum = builder.like_forum;
        this.topic = builder.topic;
        this.recommend = builder.recommend;
        this.f72608common = builder.f72609common;
        this.visit_history = builder.visit_history;
        this.sort_type = builder.sort_type;
    }
}
