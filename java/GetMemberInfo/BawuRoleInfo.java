package tbclient.GetMemberInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class BawuRoleInfo extends Message {
    public static final String DEFAULT_LEVEL_NAME = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_ROLE_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String level_name;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer role_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String role_name;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long user_id;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer user_level;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_ROLE_ID = 0;
    public static final Integer DEFAULT_USER_LEVEL = 0;

    /* synthetic */ BawuRoleInfo(Builder builder, boolean z, BawuRoleInfo bawuRoleInfo) {
        this(builder, z);
    }

    private BawuRoleInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.role_id == null) {
                this.role_id = DEFAULT_ROLE_ID;
            } else {
                this.role_id = builder.role_id;
            }
            if (builder.role_name == null) {
                this.role_name = "";
            } else {
                this.role_name = builder.role_name;
            }
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.user_level == null) {
                this.user_level = DEFAULT_USER_LEVEL;
            } else {
                this.user_level = builder.user_level;
            }
            if (builder.level_name == null) {
                this.level_name = "";
                return;
            } else {
                this.level_name = builder.level_name;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.user_id = builder.user_id;
        this.role_id = builder.role_id;
        this.role_name = builder.role_name;
        this.portrait = builder.portrait;
        this.user_level = builder.user_level;
        this.level_name = builder.level_name;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<BawuRoleInfo> {
        public Long forum_id;
        public String level_name;
        public String portrait;
        public Integer role_id;
        public String role_name;
        public Long user_id;
        public Integer user_level;

        public Builder() {
        }

        public Builder(BawuRoleInfo bawuRoleInfo) {
            super(bawuRoleInfo);
            if (bawuRoleInfo != null) {
                this.forum_id = bawuRoleInfo.forum_id;
                this.user_id = bawuRoleInfo.user_id;
                this.role_id = bawuRoleInfo.role_id;
                this.role_name = bawuRoleInfo.role_name;
                this.portrait = bawuRoleInfo.portrait;
                this.user_level = bawuRoleInfo.user_level;
                this.level_name = bawuRoleInfo.level_name;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BawuRoleInfo build(boolean z) {
            return new BawuRoleInfo(this, z, null);
        }
    }
}
