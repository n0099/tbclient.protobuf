package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ShortUserInfo extends Message {
    public static final String DEFAULT_INTRO = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer gender;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String intro;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String user_name;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_GENDER = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ShortUserInfo> {
        public Integer gender;
        public String intro;
        public String portrait;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(ShortUserInfo shortUserInfo) {
            super(shortUserInfo);
            if (shortUserInfo == null) {
                return;
            }
            this.user_id = shortUserInfo.user_id;
            this.portrait = shortUserInfo.portrait;
            this.user_name = shortUserInfo.user_name;
            this.gender = shortUserInfo.gender;
            this.intro = shortUserInfo.intro;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ShortUserInfo build(boolean z) {
            return new ShortUserInfo(this, z);
        }
    }

    public ShortUserInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            String str = builder.portrait;
            if (str == null) {
                this.portrait = "";
            } else {
                this.portrait = str;
            }
            String str2 = builder.user_name;
            if (str2 == null) {
                this.user_name = "";
            } else {
                this.user_name = str2;
            }
            Integer num = builder.gender;
            if (num == null) {
                this.gender = DEFAULT_GENDER;
            } else {
                this.gender = num;
            }
            String str3 = builder.intro;
            if (str3 == null) {
                this.intro = "";
                return;
            } else {
                this.intro = str3;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.portrait = builder.portrait;
        this.user_name = builder.user_name;
        this.gender = builder.gender;
        this.intro = builder.intro;
    }
}
