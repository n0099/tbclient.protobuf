package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ForumPresentInfo extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final List<UserRankPresentInfo> DEFAULT_USER_LIST = Collections.emptyList();
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<UserRankPresentInfo> user_list;

    /* synthetic */ ForumPresentInfo(Builder builder, boolean z, ForumPresentInfo forumPresentInfo) {
        this(builder, z);
    }

    private ForumPresentInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_list == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = immutableCopyOf(builder.user_list);
            }
            if (builder.content == null) {
                this.content = "";
                return;
            } else {
                this.content = builder.content;
                return;
            }
        }
        this.user_list = immutableCopyOf(builder.user_list);
        this.content = builder.content;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ForumPresentInfo> {
        public String content;
        public List<UserRankPresentInfo> user_list;

        public Builder() {
        }

        public Builder(ForumPresentInfo forumPresentInfo) {
            super(forumPresentInfo);
            if (forumPresentInfo != null) {
                this.user_list = ForumPresentInfo.copyOf(forumPresentInfo.user_list);
                this.content = forumPresentInfo.content;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumPresentInfo build(boolean z) {
            return new ForumPresentInfo(this, z, null);
        }
    }
}
