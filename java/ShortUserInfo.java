package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
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

    private ShortUserInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.user_name == null) {
                this.user_name = "";
            } else {
                this.user_name = builder.user_name;
            }
            if (builder.gender == null) {
                this.gender = DEFAULT_GENDER;
            } else {
                this.gender = builder.gender;
            }
            if (builder.intro == null) {
                this.intro = "";
                return;
            } else {
                this.intro = builder.intro;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.portrait = builder.portrait;
        this.user_name = builder.user_name;
        this.gender = builder.gender;
        this.intro = builder.intro;
    }

    /* loaded from: classes2.dex */
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
            if (shortUserInfo != null) {
                this.user_id = shortUserInfo.user_id;
                this.portrait = shortUserInfo.portrait;
                this.user_name = shortUserInfo.user_name;
                this.gender = shortUserInfo.gender;
                this.intro = shortUserInfo.intro;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ShortUserInfo build(boolean z) {
            return new ShortUserInfo(this, z);
        }
    }
}
