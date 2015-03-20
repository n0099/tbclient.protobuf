package tbclient.HotForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ForumInfo extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long time_out;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Long DEFAULT_TIME_OUT = 0L;

    /* synthetic */ ForumInfo(Builder builder, boolean z, ForumInfo forumInfo) {
        this(builder, z);
    }

    private ForumInfo(Builder builder, boolean z) {
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
            if (builder.time_out == null) {
                this.time_out = DEFAULT_TIME_OUT;
                return;
            } else {
                this.time_out = builder.time_out;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.time_out = builder.time_out;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<ForumInfo> {
        public String avatar;
        public Long forum_id;
        public String forum_name;
        public Long time_out;

        public Builder(ForumInfo forumInfo) {
            super(forumInfo);
            if (forumInfo != null) {
                this.forum_id = forumInfo.forum_id;
                this.forum_name = forumInfo.forum_name;
                this.avatar = forumInfo.avatar;
                this.time_out = forumInfo.time_out;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumInfo build(boolean z) {
            return new ForumInfo(this, z, null);
        }
    }
}
