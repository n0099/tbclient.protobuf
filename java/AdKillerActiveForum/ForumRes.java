package tbclient.AdKillerActiveForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class ForumRes extends Message {
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final String DEFAULT_FORUM_NAME = "";
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String forum_name;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ForumRes> {
        public Long forum_id;
        public String forum_name;

        public Builder() {
        }

        public Builder(ForumRes forumRes) {
            super(forumRes);
            if (forumRes == null) {
                return;
            }
            this.forum_name = forumRes.forum_name;
            this.forum_id = forumRes.forum_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumRes build(boolean z) {
            return new ForumRes(this, z);
        }
    }

    public ForumRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.forum_name;
            if (str == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str;
            }
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
                return;
            } else {
                this.forum_id = l;
                return;
            }
        }
        this.forum_name = builder.forum_name;
        this.forum_id = builder.forum_id;
    }
}
