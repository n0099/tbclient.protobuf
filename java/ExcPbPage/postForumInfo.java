package tbclient.ExcPbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class postForumInfo extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer is_like;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer member_count;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_IS_LIKE = 0;
    public static final Integer DEFAULT_MEMBER_COUNT = 0;

    private postForumInfo(Builder builder, boolean z) {
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
            if (builder.is_like == null) {
                this.is_like = DEFAULT_IS_LIKE;
            } else {
                this.is_like = builder.is_like;
            }
            if (builder.member_count == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
                return;
            } else {
                this.member_count = builder.member_count;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.is_like = builder.is_like;
        this.member_count = builder.member_count;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<postForumInfo> {
        public String avatar;
        public Long forum_id;
        public String forum_name;
        public Integer is_like;
        public Integer member_count;

        public Builder() {
        }

        public Builder(postForumInfo postforuminfo) {
            super(postforuminfo);
            if (postforuminfo != null) {
                this.forum_id = postforuminfo.forum_id;
                this.forum_name = postforuminfo.forum_name;
                this.avatar = postforuminfo.avatar;
                this.is_like = postforuminfo.is_like;
                this.member_count = postforuminfo.member_count;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public postForumInfo build(boolean z) {
            return new postForumInfo(this, z);
        }
    }
}
