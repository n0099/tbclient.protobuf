package tbclient.GetThemeList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ThemeList extends Message {
    public static final String DEFAULT_ICON = "";
    public static final Long DEFAULT_LAST_UPDATE_TIME = 0L;
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_TYPE = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long last_update_time;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String type;

    /* synthetic */ ThemeList(Builder builder, boolean z, ThemeList themeList) {
        this(builder, z);
    }

    private ThemeList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.icon == null) {
                this.icon = "";
            } else {
                this.icon = builder.icon;
            }
            if (builder.last_update_time == null) {
                this.last_update_time = DEFAULT_LAST_UPDATE_TIME;
            } else {
                this.last_update_time = builder.last_update_time;
            }
            if (builder.type == null) {
                this.type = "";
                return;
            } else {
                this.type = builder.type;
                return;
            }
        }
        this.name = builder.name;
        this.icon = builder.icon;
        this.last_update_time = builder.last_update_time;
        this.type = builder.type;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ThemeList> {
        public String icon;
        public Long last_update_time;
        public String name;
        public String type;

        public Builder() {
        }

        public Builder(ThemeList themeList) {
            super(themeList);
            if (themeList != null) {
                this.name = themeList.name;
                this.icon = themeList.icon;
                this.last_update_time = themeList.last_update_time;
                this.type = themeList.type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemeList build(boolean z) {
            return new ThemeList(this, z, null);
        }
    }
}
