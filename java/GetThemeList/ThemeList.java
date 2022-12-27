package tbclient.GetThemeList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
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

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ThemeList> {
        public String icon;
        public Long last_update_time;
        public String name;
        public String type;

        public Builder() {
        }

        public Builder(ThemeList themeList) {
            super(themeList);
            if (themeList == null) {
                return;
            }
            this.name = themeList.name;
            this.icon = themeList.icon;
            this.last_update_time = themeList.last_update_time;
            this.type = themeList.type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemeList build(boolean z) {
            return new ThemeList(this, z);
        }
    }

    public ThemeList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.icon;
            if (str2 == null) {
                this.icon = "";
            } else {
                this.icon = str2;
            }
            Long l = builder.last_update_time;
            if (l == null) {
                this.last_update_time = DEFAULT_LAST_UPDATE_TIME;
            } else {
                this.last_update_time = l;
            }
            String str3 = builder.type;
            if (str3 == null) {
                this.type = "";
                return;
            } else {
                this.type = str3;
                return;
            }
        }
        this.name = builder.name;
        this.icon = builder.icon;
        this.last_update_time = builder.last_update_time;
        this.type = builder.type;
    }
}
