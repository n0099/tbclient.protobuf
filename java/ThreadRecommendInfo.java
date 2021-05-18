package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class ThreadRecommendInfo extends Message {
    public static final String DEFAULT_FORUM_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_RECOMMEND_REASON = "";
    public static final Integer DEFAULT_SHOW_NUM = 0;
    public static final String DEFAULT_SHOW_TYPE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String forum_avatar;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String recommend_reason;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer show_num;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String show_type;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ThreadRecommendInfo> {
        public String forum_avatar;
        public String forum_name;
        public String recommend_reason;
        public Integer show_num;
        public String show_type;

        public Builder() {
        }

        public Builder(ThreadRecommendInfo threadRecommendInfo) {
            super(threadRecommendInfo);
            if (threadRecommendInfo == null) {
                return;
            }
            this.forum_avatar = threadRecommendInfo.forum_avatar;
            this.forum_name = threadRecommendInfo.forum_name;
            this.show_num = threadRecommendInfo.show_num;
            this.show_type = threadRecommendInfo.show_type;
            this.recommend_reason = threadRecommendInfo.recommend_reason;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadRecommendInfo build(boolean z) {
            return new ThreadRecommendInfo(this, z);
        }
    }

    public ThreadRecommendInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.forum_avatar;
            if (str == null) {
                this.forum_avatar = "";
            } else {
                this.forum_avatar = str;
            }
            String str2 = builder.forum_name;
            if (str2 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str2;
            }
            Integer num = builder.show_num;
            if (num == null) {
                this.show_num = DEFAULT_SHOW_NUM;
            } else {
                this.show_num = num;
            }
            String str3 = builder.show_type;
            if (str3 == null) {
                this.show_type = "";
            } else {
                this.show_type = str3;
            }
            String str4 = builder.recommend_reason;
            if (str4 == null) {
                this.recommend_reason = "";
                return;
            } else {
                this.recommend_reason = str4;
                return;
            }
        }
        this.forum_avatar = builder.forum_avatar;
        this.forum_name = builder.forum_name;
        this.show_num = builder.show_num;
        this.show_type = builder.show_type;
        this.recommend_reason = builder.recommend_reason;
    }
}
