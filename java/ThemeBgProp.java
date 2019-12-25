package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
public final class ThemeBgProp extends Message {
    public static final String DEFAULT_ACTIVITY_URL = "";
    public static final String DEFAULT_DESCRIPTION = "";
    public static final String DEFAULT_EXAMPLE_URL = "";
    public static final String DEFAULT_PERMISSION = "";
    public static final String DEFAULT_PROPS_STATE_IMG = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String activity_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String description;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String example_url;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer free_user_level;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer in_use;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_finished;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String permission;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer props_id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String props_state_img;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    public static final Integer DEFAULT_PROPS_ID = 0;
    public static final Integer DEFAULT_IN_USE = 0;
    public static final Integer DEFAULT_FREE_USER_LEVEL = 0;
    public static final Integer DEFAULT_IS_FINISHED = 0;

    private ThemeBgProp(Builder builder, boolean z) {
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
            if (builder.description == null) {
                this.description = "";
            } else {
                this.description = builder.description;
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
            if (builder.in_use == null) {
                this.in_use = DEFAULT_IN_USE;
            } else {
                this.in_use = builder.in_use;
            }
            if (builder.free_user_level == null) {
                this.free_user_level = DEFAULT_FREE_USER_LEVEL;
            } else {
                this.free_user_level = builder.free_user_level;
            }
            if (builder.activity_url == null) {
                this.activity_url = "";
            } else {
                this.activity_url = builder.activity_url;
            }
            if (builder.is_finished == null) {
                this.is_finished = DEFAULT_IS_FINISHED;
                return;
            } else {
                this.is_finished = builder.is_finished;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.title = builder.title;
        this.description = builder.description;
        this.example_url = builder.example_url;
        this.permission = builder.permission;
        this.props_state_img = builder.props_state_img;
        this.in_use = builder.in_use;
        this.free_user_level = builder.free_user_level;
        this.activity_url = builder.activity_url;
        this.is_finished = builder.is_finished;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<ThemeBgProp> {
        public String activity_url;
        public String description;
        public String example_url;
        public Integer free_user_level;
        public Integer in_use;
        public Integer is_finished;
        public String permission;
        public Integer props_id;
        public String props_state_img;
        public String title;

        public Builder() {
        }

        public Builder(ThemeBgProp themeBgProp) {
            super(themeBgProp);
            if (themeBgProp != null) {
                this.props_id = themeBgProp.props_id;
                this.title = themeBgProp.title;
                this.description = themeBgProp.description;
                this.example_url = themeBgProp.example_url;
                this.permission = themeBgProp.permission;
                this.props_state_img = themeBgProp.props_state_img;
                this.in_use = themeBgProp.in_use;
                this.free_user_level = themeBgProp.free_user_level;
                this.activity_url = themeBgProp.activity_url;
                this.is_finished = themeBgProp.is_finished;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemeBgProp build(boolean z) {
            return new ThemeBgProp(this, z);
        }
    }
}
