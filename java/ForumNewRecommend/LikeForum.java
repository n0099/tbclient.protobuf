package tbclient.ForumNewRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class LikeForum extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer hot_num;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_HOT_NUM = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<LikeForum> {
        public String avatar;
        public Long forum_id;
        public String forum_name;
        public Integer hot_num;

        public Builder() {
        }

        public Builder(LikeForum likeForum) {
            super(likeForum);
            if (likeForum == null) {
                return;
            }
            this.forum_id = likeForum.forum_id;
            this.forum_name = likeForum.forum_name;
            this.avatar = likeForum.avatar;
            this.hot_num = likeForum.hot_num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LikeForum build(boolean z) {
            return new LikeForum(this, z);
        }
    }

    public LikeForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            String str = builder.forum_name;
            if (str == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str;
            }
            String str2 = builder.avatar;
            if (str2 == null) {
                this.avatar = "";
            } else {
                this.avatar = str2;
            }
            Integer num = builder.hot_num;
            if (num == null) {
                this.hot_num = DEFAULT_HOT_NUM;
                return;
            } else {
                this.hot_num = num;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.hot_num = builder.hot_num;
    }
}
