package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
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

    private ThemeCardInUser(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.props_id == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = builder.props_id;
            }
            if (builder.img_ios == null) {
                this.img_ios = "";
            } else {
                this.img_ios = builder.img_ios;
            }
            if (builder.coordinate == null) {
                this.coordinate = "";
            } else {
                this.coordinate = builder.coordinate;
            }
            if (builder.img_android == null) {
                this.img_android = "";
            } else {
                this.img_android = builder.img_android;
            }
            if (builder.level == null) {
                this.level = DEFAULT_LEVEL;
                return;
            } else {
                this.level = builder.level;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.img_ios = builder.img_ios;
        this.coordinate = builder.coordinate;
        this.img_android = builder.img_android;
        this.level = builder.level;
    }

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
            if (themeCardInUser != null) {
                this.props_id = themeCardInUser.props_id;
                this.img_ios = themeCardInUser.img_ios;
                this.coordinate = themeCardInUser.coordinate;
                this.img_android = themeCardInUser.img_android;
                this.level = themeCardInUser.level;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemeCardInUser build(boolean z) {
            return new ThemeCardInUser(this, z);
        }
    }
}
