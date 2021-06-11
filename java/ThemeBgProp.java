package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
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

    /* loaded from: classes8.dex */
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
            if (themeBgProp == null) {
                return;
            }
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

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemeBgProp build(boolean z) {
            return new ThemeBgProp(this, z);
        }
    }

    public ThemeBgProp(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.props_id;
            if (num == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = num;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.description;
            if (str2 == null) {
                this.description = "";
            } else {
                this.description = str2;
            }
            String str3 = builder.example_url;
            if (str3 == null) {
                this.example_url = "";
            } else {
                this.example_url = str3;
            }
            String str4 = builder.permission;
            if (str4 == null) {
                this.permission = "";
            } else {
                this.permission = str4;
            }
            String str5 = builder.props_state_img;
            if (str5 == null) {
                this.props_state_img = "";
            } else {
                this.props_state_img = str5;
            }
            Integer num2 = builder.in_use;
            if (num2 == null) {
                this.in_use = DEFAULT_IN_USE;
            } else {
                this.in_use = num2;
            }
            Integer num3 = builder.free_user_level;
            if (num3 == null) {
                this.free_user_level = DEFAULT_FREE_USER_LEVEL;
            } else {
                this.free_user_level = num3;
            }
            String str6 = builder.activity_url;
            if (str6 == null) {
                this.activity_url = "";
            } else {
                this.activity_url = str6;
            }
            Integer num4 = builder.is_finished;
            if (num4 == null) {
                this.is_finished = DEFAULT_IS_FINISHED;
                return;
            } else {
                this.is_finished = num4;
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
}
