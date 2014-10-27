package tbclient.RecommendFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ForumInfo extends Message {
    public static final String DEFAULT_COMMON_FORUM = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String common_forum;

    /* synthetic */ ForumInfo(Builder builder, boolean z, ForumInfo forumInfo) {
        this(builder, z);
    }

    private ForumInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.common_forum == null) {
                this.common_forum = "";
                return;
            } else {
                this.common_forum = builder.common_forum;
                return;
            }
        }
        this.common_forum = builder.common_forum;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<ForumInfo> {
        public String common_forum;

        public Builder(ForumInfo forumInfo) {
            super(forumInfo);
            if (forumInfo != null) {
                this.common_forum = forumInfo.common_forum;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumInfo build(boolean z) {
            return new ForumInfo(this, z, null);
        }
    }
}
