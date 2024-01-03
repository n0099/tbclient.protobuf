package tbclient.GetRank;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class UserInfo extends Message {
    public static final String DEFAULT_ACHIEVEMENT = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String achievement;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long grade;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_GRADE = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<UserInfo> {
        public String achievement;
        public Long grade;
        public String portrait;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(UserInfo userInfo) {
            super(userInfo);
            if (userInfo == null) {
                return;
            }
            this.user_id = userInfo.user_id;
            this.user_name = userInfo.user_name;
            this.portrait = userInfo.portrait;
            this.grade = userInfo.grade;
            this.achievement = userInfo.achievement;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserInfo build(boolean z) {
            return new UserInfo(this, z);
        }
    }

    public UserInfo(Builder builder, boolean z) {
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
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            Long l2 = builder.grade;
            if (l2 == null) {
                this.grade = DEFAULT_GRADE;
            } else {
                this.grade = l2;
            }
            String str3 = builder.achievement;
            if (str3 == null) {
                this.achievement = "";
                return;
            } else {
                this.achievement = str3;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
        this.grade = builder.grade;
        this.achievement = builder.achievement;
    }
}
