package tbclient.ExcPbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ForumInfo extends Message {
    public static final Long DEFAULT_FORUM_ID = 0L;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long forum_id;

    /* synthetic */ ForumInfo(Builder builder, boolean z, ForumInfo forumInfo) {
        this(builder, z);
    }

    private ForumInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
                return;
            } else {
                this.forum_id = builder.forum_id;
                return;
            }
        }
        this.forum_id = builder.forum_id;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ForumInfo> {
        public Long forum_id;

        public Builder() {
        }

        public Builder(ForumInfo forumInfo) {
            super(forumInfo);
            if (forumInfo != null) {
                this.forum_id = forumInfo.forum_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumInfo build(boolean z) {
            return new ForumInfo(this, z, null);
        }
    }
}
