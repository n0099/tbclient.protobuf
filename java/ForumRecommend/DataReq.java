package tbclient.ForumRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 4)
    public final CommonReq common;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer like_forum;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer recommend;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer topic;
    public static final Integer DEFAULT_LIKE_FORUM = 0;
    public static final Integer DEFAULT_TOPIC = 0;
    public static final Integer DEFAULT_RECOMMEND = 0;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

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
            this.common = builder.common;
            return;
        }
        this.like_forum = builder.like_forum;
        this.topic = builder.topic;
        this.recommend = builder.recommend;
        this.common = builder.common;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public Integer like_forum;
        public Integer recommend;
        public Integer topic;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.like_forum = dataReq.like_forum;
                this.topic = dataReq.topic;
                this.recommend = dataReq.recommend;
                this.common = dataReq.common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
