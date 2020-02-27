package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class SimpleForum extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_EXT = "";
    public static final String DEFAULT_FIRST_CLASS = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_SECOND_CLASS = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String ext;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String first_class;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer is_brand_forum;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_exists;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer is_liked;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer is_signed;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer level_id;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer member_num;
    @ProtoField(tag = 11)
    public final MultiForumPerm multi_forum_perm;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer post_num;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String second_class;
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_IS_EXISTS = 0;
    public static final Integer DEFAULT_IS_LIKED = 0;
    public static final Integer DEFAULT_IS_SIGNED = 0;
    public static final Integer DEFAULT_LEVEL_ID = 0;
    public static final Integer DEFAULT_MEMBER_NUM = 0;
    public static final Integer DEFAULT_POST_NUM = 0;
    public static final Integer DEFAULT_IS_BRAND_FORUM = 0;

    private SimpleForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.is_exists == null) {
                this.is_exists = DEFAULT_IS_EXISTS;
            } else {
                this.is_exists = builder.is_exists;
            }
            if (builder.avatar == null) {
                this.avatar = "";
            } else {
                this.avatar = builder.avatar;
            }
            if (builder.is_liked == null) {
                this.is_liked = DEFAULT_IS_LIKED;
            } else {
                this.is_liked = builder.is_liked;
            }
            if (builder.is_signed == null) {
                this.is_signed = DEFAULT_IS_SIGNED;
            } else {
                this.is_signed = builder.is_signed;
            }
            if (builder.first_class == null) {
                this.first_class = "";
            } else {
                this.first_class = builder.first_class;
            }
            if (builder.second_class == null) {
                this.second_class = "";
            } else {
                this.second_class = builder.second_class;
            }
            if (builder.ext == null) {
                this.ext = "";
            } else {
                this.ext = builder.ext;
            }
            if (builder.level_id == null) {
                this.level_id = DEFAULT_LEVEL_ID;
            } else {
                this.level_id = builder.level_id;
            }
            this.multi_forum_perm = builder.multi_forum_perm;
            if (builder.member_num == null) {
                this.member_num = DEFAULT_MEMBER_NUM;
            } else {
                this.member_num = builder.member_num;
            }
            if (builder.post_num == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = builder.post_num;
            }
            if (builder.is_brand_forum == null) {
                this.is_brand_forum = DEFAULT_IS_BRAND_FORUM;
                return;
            } else {
                this.is_brand_forum = builder.is_brand_forum;
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.is_exists = builder.is_exists;
        this.avatar = builder.avatar;
        this.is_liked = builder.is_liked;
        this.is_signed = builder.is_signed;
        this.first_class = builder.first_class;
        this.second_class = builder.second_class;
        this.ext = builder.ext;
        this.level_id = builder.level_id;
        this.multi_forum_perm = builder.multi_forum_perm;
        this.member_num = builder.member_num;
        this.post_num = builder.post_num;
        this.is_brand_forum = builder.is_brand_forum;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SimpleForum> {
        public String avatar;
        public String ext;
        public String first_class;
        public Long id;
        public Integer is_brand_forum;
        public Integer is_exists;
        public Integer is_liked;
        public Integer is_signed;
        public Integer level_id;
        public Integer member_num;
        public MultiForumPerm multi_forum_perm;
        public String name;
        public Integer post_num;
        public String second_class;

        public Builder() {
        }

        public Builder(SimpleForum simpleForum) {
            super(simpleForum);
            if (simpleForum != null) {
                this.id = simpleForum.id;
                this.name = simpleForum.name;
                this.is_exists = simpleForum.is_exists;
                this.avatar = simpleForum.avatar;
                this.is_liked = simpleForum.is_liked;
                this.is_signed = simpleForum.is_signed;
                this.first_class = simpleForum.first_class;
                this.second_class = simpleForum.second_class;
                this.ext = simpleForum.ext;
                this.level_id = simpleForum.level_id;
                this.multi_forum_perm = simpleForum.multi_forum_perm;
                this.member_num = simpleForum.member_num;
                this.post_num = simpleForum.post_num;
                this.is_brand_forum = simpleForum.is_brand_forum;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SimpleForum build(boolean z) {
            return new SimpleForum(this, z);
        }
    }
}
