package tbclient.ExcPbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
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

    /* loaded from: classes7.dex */
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
            if (postforuminfo == null) {
                return;
            }
            this.forum_id = postforuminfo.forum_id;
            this.forum_name = postforuminfo.forum_name;
            this.avatar = postforuminfo.avatar;
            this.is_like = postforuminfo.is_like;
            this.member_count = postforuminfo.member_count;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public postForumInfo build(boolean z) {
            return new postForumInfo(this, z);
        }
    }

    public postForumInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            String str = builder.forum_name;
            if (str == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str;
            }
            String str2 = builder.avatar;
            if (str2 == null) {
                this.avatar = "";
            } else {
                this.avatar = str2;
            }
            Integer num = builder.is_like;
            if (num == null) {
                this.is_like = DEFAULT_IS_LIKE;
            } else {
                this.is_like = num;
            }
            Integer num2 = builder.member_count;
            if (num2 == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
                return;
            } else {
                this.member_count = num2;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.is_like = builder.is_like;
        this.member_count = builder.member_count;
    }
}
