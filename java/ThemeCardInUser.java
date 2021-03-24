package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ThemeCardInUser extends Message {
    public static final String DEFAULT_COORDINATE = "";
    public static final String DEFAULT_IMG_ANDROID = "";
    public static final String DEFAULT_IMG_IOS = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String coordinate;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String img_android;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String img_ios;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer level;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long props_id;
    public static final Long DEFAULT_PROPS_ID = 0L;
    public static final Integer DEFAULT_LEVEL = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ThemeCardInUser> {
        public String coordinate;
        public String img_android;
        public String img_ios;
        public Integer level;
        public Long props_id;

        public Builder() {
        }

        public Builder(ThemeCardInUser themeCardInUser) {
            super(themeCardInUser);
            if (themeCardInUser == null) {
                return;
            }
            this.props_id = themeCardInUser.props_id;
            this.img_ios = themeCardInUser.img_ios;
            this.coordinate = themeCardInUser.coordinate;
            this.img_android = themeCardInUser.img_android;
            this.level = themeCardInUser.level;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemeCardInUser build(boolean z) {
            return new ThemeCardInUser(this, z);
        }
    }

    public ThemeCardInUser(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.props_id;
            if (l == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = l;
            }
            String str = builder.img_ios;
            if (str == null) {
                this.img_ios = "";
            } else {
                this.img_ios = str;
            }
            String str2 = builder.coordinate;
            if (str2 == null) {
                this.coordinate = "";
            } else {
                this.coordinate = str2;
            }
            String str3 = builder.img_android;
            if (str3 == null) {
                this.img_android = "";
            } else {
                this.img_android = str3;
            }
            Integer num = builder.level;
            if (num == null) {
                this.level = DEFAULT_LEVEL;
                return;
            } else {
                this.level = num;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.img_ios = builder.img_ios;
        this.coordinate = builder.coordinate;
        this.img_android = builder.img_android;
        this.level = builder.level;
    }
}
