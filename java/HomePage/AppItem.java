package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class AppItem extends Message {
    public static final String DEFAULT_APP_ICON = "";
    public static final String DEFAULT_APP_LINK = "";
    public static final String DEFAULT_APP_NAME = "";
    public static final Integer DEFAULT_ICON_TYPE = 0;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String app_icon;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String app_link;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String app_name;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer icon_type;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<AppItem> {
        public String app_icon;
        public String app_link;
        public String app_name;
        public Integer icon_type;

        public Builder() {
        }

        public Builder(AppItem appItem) {
            super(appItem);
            if (appItem == null) {
                return;
            }
            this.app_name = appItem.app_name;
            this.app_icon = appItem.app_icon;
            this.app_link = appItem.app_link;
            this.icon_type = appItem.icon_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AppItem build(boolean z) {
            return new AppItem(this, z);
        }
    }

    public AppItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.app_name;
            if (str == null) {
                this.app_name = "";
            } else {
                this.app_name = str;
            }
            String str2 = builder.app_icon;
            if (str2 == null) {
                this.app_icon = "";
            } else {
                this.app_icon = str2;
            }
            String str3 = builder.app_link;
            if (str3 == null) {
                this.app_link = "";
            } else {
                this.app_link = str3;
            }
            Integer num = builder.icon_type;
            if (num == null) {
                this.icon_type = DEFAULT_ICON_TYPE;
                return;
            } else {
                this.icon_type = num;
                return;
            }
        }
        this.app_name = builder.app_name;
        this.app_icon = builder.app_icon;
        this.app_link = builder.app_link;
        this.icon_type = builder.icon_type;
    }
}
