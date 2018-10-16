package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class RecmForumInfo extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer member_count;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer post_num;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_MEMBER_COUNT = 0;
    public static final Integer DEFAULT_POST_NUM = 0;

    private RecmForumInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum_name == null) {
                this.forum_name = "";
            } else {
                this.forum_name = builder.forum_name;
            }
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.member_count == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
            } else {
                this.member_count = builder.member_count;
            }
            if (builder.post_num == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = builder.post_num;
            }
            if (builder.avatar == null) {
                this.avatar = "";
                return;
            } else {
                this.avatar = builder.avatar;
                return;
            }
        }
        this.forum_name = builder.forum_name;
        this.forum_id = builder.forum_id;
        this.member_count = builder.member_count;
        this.post_num = builder.post_num;
        this.avatar = builder.avatar;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<RecmForumInfo> {
        public String avatar;
        public Long forum_id;
        public String forum_name;
        public Integer member_count;
        public Integer post_num;

        public Builder() {
        }

        public Builder(RecmForumInfo recmForumInfo) {
            super(recmForumInfo);
            if (recmForumInfo != null) {
                this.forum_name = recmForumInfo.forum_name;
                this.forum_id = recmForumInfo.forum_id;
                this.member_count = recmForumInfo.member_count;
                this.post_num = recmForumInfo.post_num;
                this.avatar = recmForumInfo.avatar;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecmForumInfo build(boolean z) {
            return new RecmForumInfo(this, z);
        }
    }
}
