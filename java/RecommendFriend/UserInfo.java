package tbclient.RecommendFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class UserInfo extends Message {
    public static final String DEFAULT_INTRO = "";
    public static final String DEFAULT_MESSAGE = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_ST_TYPE = "";
    public static final String DEFAULT_TAG_NAME = "";
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer distance;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String intro;
    @ProtoField(tag = 8)
    public final LbsInfo location;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String message;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer sex;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String st_type;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String tag_name;
    @ProtoField(tag = 7)
    public final ShowIcon tshow_icon;
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_SEX = 0;
    public static final Integer DEFAULT_DISTANCE = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<UserInfo> {
        public Integer distance;
        public Long id;
        public String intro;
        public LbsInfo location;
        public String message;
        public String name;
        public String portrait;
        public Integer sex;
        public String st_type;
        public String tag_name;
        public ShowIcon tshow_icon;

        public Builder() {
        }

        public Builder(UserInfo userInfo) {
            super(userInfo);
            if (userInfo == null) {
                return;
            }
            this.id = userInfo.id;
            this.portrait = userInfo.portrait;
            this.name = userInfo.name;
            this.sex = userInfo.sex;
            this.distance = userInfo.distance;
            this.intro = userInfo.intro;
            this.tshow_icon = userInfo.tshow_icon;
            this.location = userInfo.location;
            this.tag_name = userInfo.tag_name;
            this.st_type = userInfo.st_type;
            this.message = userInfo.message;
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
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            String str = builder.portrait;
            if (str == null) {
                this.portrait = "";
            } else {
                this.portrait = str;
            }
            String str2 = builder.name;
            if (str2 == null) {
                this.name = "";
            } else {
                this.name = str2;
            }
            Integer num = builder.sex;
            if (num == null) {
                this.sex = DEFAULT_SEX;
            } else {
                this.sex = num;
            }
            Integer num2 = builder.distance;
            if (num2 == null) {
                this.distance = DEFAULT_DISTANCE;
            } else {
                this.distance = num2;
            }
            String str3 = builder.intro;
            if (str3 == null) {
                this.intro = "";
            } else {
                this.intro = str3;
            }
            this.tshow_icon = builder.tshow_icon;
            this.location = builder.location;
            String str4 = builder.tag_name;
            if (str4 == null) {
                this.tag_name = "";
            } else {
                this.tag_name = str4;
            }
            String str5 = builder.st_type;
            if (str5 == null) {
                this.st_type = "";
            } else {
                this.st_type = str5;
            }
            String str6 = builder.message;
            if (str6 == null) {
                this.message = "";
                return;
            } else {
                this.message = str6;
                return;
            }
        }
        this.id = builder.id;
        this.portrait = builder.portrait;
        this.name = builder.name;
        this.sex = builder.sex;
        this.distance = builder.distance;
        this.intro = builder.intro;
        this.tshow_icon = builder.tshow_icon;
        this.location = builder.location;
        this.tag_name = builder.tag_name;
        this.st_type = builder.st_type;
        this.message = builder.message;
    }
}
