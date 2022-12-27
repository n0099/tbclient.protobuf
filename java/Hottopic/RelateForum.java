package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class RelateForum extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_FORUM_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer is_liked;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer member_num;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer post_num;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer thread_num;
    public static final Integer DEFAULT_FORUM_ID = 0;
    public static final Integer DEFAULT_MEMBER_NUM = 0;
    public static final Integer DEFAULT_THREAD_NUM = 0;
    public static final Integer DEFAULT_POST_NUM = 0;
    public static final Integer DEFAULT_IS_LIKED = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<RelateForum> {
        public String avatar;
        public String desc;
        public Integer forum_id;
        public String forum_name;
        public Integer is_liked;
        public Integer member_num;
        public Integer post_num;
        public Integer thread_num;

        public Builder() {
        }

        public Builder(RelateForum relateForum) {
            super(relateForum);
            if (relateForum == null) {
                return;
            }
            this.forum_id = relateForum.forum_id;
            this.forum_name = relateForum.forum_name;
            this.avatar = relateForum.avatar;
            this.desc = relateForum.desc;
            this.member_num = relateForum.member_num;
            this.thread_num = relateForum.thread_num;
            this.post_num = relateForum.post_num;
            this.is_liked = relateForum.is_liked;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RelateForum build(boolean z) {
            return new RelateForum(this, z);
        }
    }

    public RelateForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.forum_id;
            if (num == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = num;
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
            String str3 = builder.desc;
            if (str3 == null) {
                this.desc = "";
            } else {
                this.desc = str3;
            }
            Integer num2 = builder.member_num;
            if (num2 == null) {
                this.member_num = DEFAULT_MEMBER_NUM;
            } else {
                this.member_num = num2;
            }
            Integer num3 = builder.thread_num;
            if (num3 == null) {
                this.thread_num = DEFAULT_THREAD_NUM;
            } else {
                this.thread_num = num3;
            }
            Integer num4 = builder.post_num;
            if (num4 == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = num4;
            }
            Integer num5 = builder.is_liked;
            if (num5 == null) {
                this.is_liked = DEFAULT_IS_LIKED;
                return;
            } else {
                this.is_liked = num5;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.desc = builder.desc;
        this.member_num = builder.member_num;
        this.thread_num = builder.thread_num;
        this.post_num = builder.post_num;
        this.is_liked = builder.is_liked;
    }
}
