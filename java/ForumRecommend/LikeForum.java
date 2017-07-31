package tbclient.ForumRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
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
    public final Integer is_sign;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer level_id;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_IS_SIGN = 0;
    public static final Integer DEFAULT_LEVEL_ID = 0;

    private LikeForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.forum_name == null) {
                this.forum_name = "";
            } else {
                this.forum_name = builder.forum_name;
            }
            if (builder.avatar == null) {
                this.avatar = "";
            } else {
                this.avatar = builder.avatar;
            }
            if (builder.is_sign == null) {
                this.is_sign = DEFAULT_IS_SIGN;
            } else {
                this.is_sign = builder.is_sign;
            }
            if (builder.level_id == null) {
                this.level_id = DEFAULT_LEVEL_ID;
                return;
            } else {
                this.level_id = builder.level_id;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.is_sign = builder.is_sign;
        this.level_id = builder.level_id;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<LikeForum> {
        public String avatar;
        public Long forum_id;
        public String forum_name;
        public Integer is_sign;
        public Integer level_id;

        public Builder() {
        }

        public Builder(LikeForum likeForum) {
            super(likeForum);
            if (likeForum != null) {
                this.forum_id = likeForum.forum_id;
                this.forum_name = likeForum.forum_name;
                this.avatar = likeForum.avatar;
                this.is_sign = likeForum.is_sign;
                this.level_id = likeForum.level_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LikeForum build(boolean z) {
            return new LikeForum(this, z);
        }
    }
}
