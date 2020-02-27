package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ForumActiveInfo extends Message {
    public static final String DEFAULT_FORUM_BRIEF = "";
    public static final String DEFAULT_FORUM_SHARE_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String forum_brief;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String forum_share_url;

    public ForumActiveInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum_brief == null) {
                this.forum_brief = "";
            } else {
                this.forum_brief = builder.forum_brief;
            }
            if (builder.forum_share_url == null) {
                this.forum_share_url = "";
                return;
            } else {
                this.forum_share_url = builder.forum_share_url;
                return;
            }
        }
        this.forum_brief = builder.forum_brief;
        this.forum_share_url = builder.forum_share_url;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ForumActiveInfo> {
        public String forum_brief;
        public String forum_share_url;

        public Builder() {
        }

        public Builder(ForumActiveInfo forumActiveInfo) {
            super(forumActiveInfo);
            if (forumActiveInfo != null) {
                this.forum_brief = forumActiveInfo.forum_brief;
                this.forum_share_url = forumActiveInfo.forum_share_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumActiveInfo build(boolean z) {
            return new ForumActiveInfo(this, z);
        }
    }
}
