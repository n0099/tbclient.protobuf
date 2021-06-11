package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public final class ForumPresentInfo extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final List<UserRankPresentInfo> DEFAULT_USER_LIST = Collections.emptyList();
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<UserRankPresentInfo> user_list;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ForumPresentInfo> {
        public String content;
        public List<UserRankPresentInfo> user_list;

        public Builder() {
        }

        public Builder(ForumPresentInfo forumPresentInfo) {
            super(forumPresentInfo);
            if (forumPresentInfo == null) {
                return;
            }
            this.user_list = Message.copyOf(forumPresentInfo.user_list);
            this.content = forumPresentInfo.content;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumPresentInfo build(boolean z) {
            return new ForumPresentInfo(this, z);
        }
    }

    public ForumPresentInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<UserRankPresentInfo> list = builder.user_list;
            if (list == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = Message.immutableCopyOf(list);
            }
            String str = builder.content;
            if (str == null) {
                this.content = "";
                return;
            } else {
                this.content = str;
                return;
            }
        }
        this.user_list = Message.immutableCopyOf(builder.user_list);
        this.content = builder.content;
    }
}
