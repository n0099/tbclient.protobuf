package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class CustomGrid extends Message {
    public static final String DEFAULT_ACTION_URI = "";
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_MARK_TEXT = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer action_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String action_uri;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String mark_text;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long red_point_version;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Integer DEFAULT_ACTION_TYPE = 0;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Long DEFAULT_RED_POINT_VERSION = 0L;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<CustomGrid> {
        public Integer action_type;
        public String action_uri;
        public String desc;
        public String icon;
        public String mark_text;
        public Long red_point_version;
        public String title;
        public Integer type;

        public Builder() {
        }

        public Builder(CustomGrid customGrid) {
            super(customGrid);
            if (customGrid == null) {
                return;
            }
            this.title = customGrid.title;
            this.action_uri = customGrid.action_uri;
            this.action_type = customGrid.action_type;
            this.icon = customGrid.icon;
            this.type = customGrid.type;
            this.red_point_version = customGrid.red_point_version;
            this.desc = customGrid.desc;
            this.mark_text = customGrid.mark_text;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CustomGrid build(boolean z) {
            return new CustomGrid(this, z);
        }
    }

    public CustomGrid(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.action_uri;
            if (str2 == null) {
                this.action_uri = "";
            } else {
                this.action_uri = str2;
            }
            Integer num = builder.action_type;
            if (num == null) {
                this.action_type = DEFAULT_ACTION_TYPE;
            } else {
                this.action_type = num;
            }
            String str3 = builder.icon;
            if (str3 == null) {
                this.icon = "";
            } else {
                this.icon = str3;
            }
            Integer num2 = builder.type;
            if (num2 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num2;
            }
            Long l = builder.red_point_version;
            if (l == null) {
                this.red_point_version = DEFAULT_RED_POINT_VERSION;
            } else {
                this.red_point_version = l;
            }
            String str4 = builder.desc;
            if (str4 == null) {
                this.desc = "";
            } else {
                this.desc = str4;
            }
            String str5 = builder.mark_text;
            if (str5 == null) {
                this.mark_text = "";
                return;
            } else {
                this.mark_text = str5;
                return;
            }
        }
        this.title = builder.title;
        this.action_uri = builder.action_uri;
        this.action_type = builder.action_type;
        this.icon = builder.icon;
        this.type = builder.type;
        this.red_point_version = builder.red_point_version;
        this.desc = builder.desc;
        this.mark_text = builder.mark_text;
    }
}
