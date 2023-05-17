package tbclient.GetTodayRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class Forum extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_like;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_IS_LIKE = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<Forum> {
        public String avatar;
        public Long forum_id;
        public String forum_name;
        public Integer is_like;

        public Builder() {
        }

        public Builder(Forum forum) {
            super(forum);
            if (forum == null) {
                return;
            }
            this.forum_id = forum.forum_id;
            this.forum_name = forum.forum_name;
            this.avatar = forum.avatar;
            this.is_like = forum.is_like;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Forum build(boolean z) {
            return new Forum(this, z);
        }
    }

    public Forum(Builder builder, boolean z) {
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
            Integer num = builder.is_like;
            if (num == null) {
                this.is_like = DEFAULT_IS_LIKE;
                return;
            } else {
                this.is_like = num;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.is_like = builder.is_like;
    }
}
