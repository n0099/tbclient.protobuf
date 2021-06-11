package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class LikeForumInfo extends Message {
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final String DEFAULT_FORUM_NAME = "";
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String forum_name;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<LikeForumInfo> {
        public Long forum_id;
        public String forum_name;

        public Builder() {
        }

        public Builder(LikeForumInfo likeForumInfo) {
            super(likeForumInfo);
            if (likeForumInfo == null) {
                return;
            }
            this.forum_name = likeForumInfo.forum_name;
            this.forum_id = likeForumInfo.forum_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LikeForumInfo build(boolean z) {
            return new LikeForumInfo(this, z);
        }
    }

    public LikeForumInfo(Builder builder, boolean z) {
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
