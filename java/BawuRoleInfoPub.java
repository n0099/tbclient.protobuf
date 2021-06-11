package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class BawuRoleInfoPub extends Message {
    public static final String DEFAULT_LEVEL_NAME = "";
    public static final String DEFAULT_NAME_SHOW = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_ROLE_NAME = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 10)
    public final BaijiahaoInfo baijiahao_info;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String level_name;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String name_show;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer role_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String role_name;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer user_level;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String user_name;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_ROLE_ID = 0;
    public static final Integer DEFAULT_USER_LEVEL = 0;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<BawuRoleInfoPub> {
        public BaijiahaoInfo baijiahao_info;
        public Long forum_id;
        public String level_name;
        public String name_show;
        public String portrait;
        public Integer role_id;
        public String role_name;
        public Long user_id;
        public Integer user_level;
        public String user_name;

        public Builder() {
        }

        public Builder(BawuRoleInfoPub bawuRoleInfoPub) {
            super(bawuRoleInfoPub);
            if (bawuRoleInfoPub == null) {
                return;
            }
            this.forum_id = bawuRoleInfoPub.forum_id;
            this.user_id = bawuRoleInfoPub.user_id;
            this.role_id = bawuRoleInfoPub.role_id;
            this.role_name = bawuRoleInfoPub.role_name;
            this.portrait = bawuRoleInfoPub.portrait;
            this.user_level = bawuRoleInfoPub.user_level;
            this.level_name = bawuRoleInfoPub.level_name;
            this.user_name = bawuRoleInfoPub.user_name;
            this.name_show = bawuRoleInfoPub.name_show;
            this.baijiahao_info = bawuRoleInfoPub.baijiahao_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BawuRoleInfoPub build(boolean z) {
            return new BawuRoleInfoPub(this, z);
        }
    }

    public BawuRoleInfoPub(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            Long l2 = builder.user_id;
            if (l2 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l2;
            }
            Integer num = builder.role_id;
            if (num == null) {
                this.role_id = DEFAULT_ROLE_ID;
            } else {
                this.role_id = num;
            }
            String str = builder.role_name;
            if (str == null) {
                this.role_name = "";
            } else {
                this.role_name = str;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            Integer num2 = builder.user_level;
            if (num2 == null) {
                this.user_level = DEFAULT_USER_LEVEL;
            } else {
                this.user_level = num2;
            }
            String str3 = builder.level_name;
            if (str3 == null) {
                this.level_name = "";
            } else {
                this.level_name = str3;
            }
            String str4 = builder.user_name;
            if (str4 == null) {
                this.user_name = "";
            } else {
                this.user_name = str4;
            }
            String str5 = builder.name_show;
            if (str5 == null) {
                this.name_show = "";
            } else {
                this.name_show = str5;
            }
            this.baijiahao_info = builder.baijiahao_info;
            return;
        }
        this.forum_id = builder.forum_id;
        this.user_id = builder.user_id;
        this.role_id = builder.role_id;
        this.role_name = builder.role_name;
        this.portrait = builder.portrait;
        this.user_level = builder.user_level;
        this.level_name = builder.level_name;
        this.user_name = builder.user_name;
        this.name_show = builder.name_show;
        this.baijiahao_info = builder.baijiahao_info;
    }
}
