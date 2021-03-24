package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class BazhuForum extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer is_sign;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer level_id;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer role_id;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long user_id;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_LEVEL_ID = 0;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_ROLE_ID = 0;
    public static final Integer DEFAULT_IS_SIGN = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<BazhuForum> {
        public String avatar;
        public Long forum_id;
        public String forum_name;
        public Integer is_sign;
        public Integer level_id;
        public Integer role_id;
        public Long user_id;

        public Builder() {
        }

        public Builder(BazhuForum bazhuForum) {
            super(bazhuForum);
            if (bazhuForum == null) {
                return;
            }
            this.forum_id = bazhuForum.forum_id;
            this.forum_name = bazhuForum.forum_name;
            this.level_id = bazhuForum.level_id;
            this.user_id = bazhuForum.user_id;
            this.role_id = bazhuForum.role_id;
            this.avatar = bazhuForum.avatar;
            this.is_sign = bazhuForum.is_sign;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BazhuForum build(boolean z) {
            return new BazhuForum(this, z);
        }
    }

    public BazhuForum(Builder builder, boolean z) {
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
            Integer num = builder.level_id;
            if (num == null) {
                this.level_id = DEFAULT_LEVEL_ID;
            } else {
                this.level_id = num;
            }
            Long l2 = builder.user_id;
            if (l2 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l2;
            }
            Integer num2 = builder.role_id;
            if (num2 == null) {
                this.role_id = DEFAULT_ROLE_ID;
            } else {
                this.role_id = num2;
            }
            String str2 = builder.avatar;
            if (str2 == null) {
                this.avatar = "";
            } else {
                this.avatar = str2;
            }
            Integer num3 = builder.is_sign;
            if (num3 == null) {
                this.is_sign = DEFAULT_IS_SIGN;
                return;
            } else {
                this.is_sign = num3;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.level_id = builder.level_id;
        this.user_id = builder.user_id;
        this.role_id = builder.role_id;
        this.avatar = builder.avatar;
        this.is_sign = builder.is_sign;
    }
}
