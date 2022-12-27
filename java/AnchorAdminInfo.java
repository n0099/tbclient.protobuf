package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class AnchorAdminInfo extends Message {
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_USER_NICKNAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer sex;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String user_nickname;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_SEX = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<AnchorAdminInfo> {
        public String portrait;
        public Integer sex;
        public Long user_id;
        public String user_name;
        public String user_nickname;

        public Builder() {
        }

        public Builder(AnchorAdminInfo anchorAdminInfo) {
            super(anchorAdminInfo);
            if (anchorAdminInfo == null) {
                return;
            }
            this.user_id = anchorAdminInfo.user_id;
            this.user_name = anchorAdminInfo.user_name;
            this.user_nickname = anchorAdminInfo.user_nickname;
            this.portrait = anchorAdminInfo.portrait;
            this.sex = anchorAdminInfo.sex;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AnchorAdminInfo build(boolean z) {
            return new AnchorAdminInfo(this, z);
        }
    }

    public AnchorAdminInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            String str2 = builder.user_nickname;
            if (str2 == null) {
                this.user_nickname = "";
            } else {
                this.user_nickname = str2;
            }
            String str3 = builder.portrait;
            if (str3 == null) {
                this.portrait = "";
            } else {
                this.portrait = str3;
            }
            Integer num = builder.sex;
            if (num == null) {
                this.sex = DEFAULT_SEX;
                return;
            } else {
                this.sex = num;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.user_nickname = builder.user_nickname;
        this.portrait = builder.portrait;
        this.sex = builder.sex;
    }
}
