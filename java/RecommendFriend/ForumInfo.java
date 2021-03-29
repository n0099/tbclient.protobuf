package tbclient.RecommendFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class ForumInfo extends Message {
    public static final String DEFAULT_COMMON_FORUM = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String common_forum;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ForumInfo> {
        public String common_forum;

        public Builder() {
        }

        public Builder(ForumInfo forumInfo) {
            super(forumInfo);
            if (forumInfo == null) {
                return;
            }
            this.common_forum = forumInfo.common_forum;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumInfo build(boolean z) {
            return new ForumInfo(this, z);
        }
    }

    public ForumInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.common_forum;
            if (str == null) {
                this.common_forum = "";
                return;
            } else {
                this.common_forum = str;
                return;
            }
        }
        this.common_forum = builder.common_forum;
    }
}
