package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ThemeSkinPropMain extends Message {
    public static final String DEFAULT_ACTIVITY_URL = "";
    public static final String DEFAULT_EXAMPLE_URL = "";
    public static final String DEFAULT_PACKAGE_SIZE = "";
    public static final String DEFAULT_PACKAGE_URL = "";
    public static final String DEFAULT_PERMISSION = "";
    public static final String DEFAULT_PROPS_STATE_IMG = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String activity_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String example_url;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer free_user_level;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String package_size;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String package_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String permission;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer props_id;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String props_state_img;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer props_version;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    public static final Integer DEFAULT_PROPS_ID = 0;
    public static final Integer DEFAULT_PROPS_VERSION = 0;
    public static final Integer DEFAULT_FREE_USER_LEVEL = 0;

    /* synthetic */ ThemeSkinPropMain(Builder builder, boolean z, ThemeSkinPropMain themeSkinPropMain) {
        this(builder, z);
    }

    private ThemeSkinPropMain(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.props_id == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = builder.props_id;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.example_url == null) {
                this.example_url = "";
            } else {
                this.example_url = builder.example_url;
            }
            if (builder.permission == null) {
                this.permission = "";
            } else {
                this.permission = builder.permission;
            }
            if (builder.props_state_img == null) {
                this.props_state_img = "";
            } else {
                this.props_state_img = builder.props_state_img;
            }
            if (builder.package_url == null) {
                this.package_url = "";
            } else {
                this.package_url = builder.package_url;
            }
            if (builder.package_size == null) {
                this.package_size = "";
            } else {
                this.package_size = builder.package_size;
            }
            if (builder.props_version == null) {
                this.props_version = DEFAULT_PROPS_VERSION;
            } else {
                this.props_version = builder.props_version;
            }
            if (builder.free_user_level == null) {
                this.free_user_level = DEFAULT_FREE_USER_LEVEL;
            } else {
                this.free_user_level = builder.free_user_level;
            }
            if (builder.activity_url == null) {
                this.activity_url = "";
                return;
            } else {
                this.activity_url = builder.activity_url;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.title = builder.title;
        this.example_url = builder.example_url;
        this.permission = builder.permission;
        this.props_state_img = builder.props_state_img;
        this.package_url = builder.package_url;
        this.package_size = builder.package_size;
        this.props_version = builder.props_version;
        this.free_user_level = builder.free_user_level;
        this.activity_url = builder.activity_url;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ThemeSkinPropMain> {
        public String activity_url;
        public String example_url;
        public Integer free_user_level;
        public String package_size;
        public String package_url;
        public String permission;
        public Integer props_id;
        public String props_state_img;
        public Integer props_version;
        public String title;

        public Builder() {
        }

        public Builder(ThemeSkinPropMain themeSkinPropMain) {
            super(themeSkinPropMain);
            if (themeSkinPropMain != null) {
                this.props_id = themeSkinPropMain.props_id;
                this.title = themeSkinPropMain.title;
                this.example_url = themeSkinPropMain.example_url;
                this.permission = themeSkinPropMain.permission;
                this.props_state_img = themeSkinPropMain.props_state_img;
                this.package_url = themeSkinPropMain.package_url;
                this.package_size = themeSkinPropMain.package_size;
                this.props_version = themeSkinPropMain.props_version;
                this.free_user_level = themeSkinPropMain.free_user_level;
                this.activity_url = themeSkinPropMain.activity_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemeSkinPropMain build(boolean z) {
            return new ThemeSkinPropMain(this, z, null);
        }
    }
}
