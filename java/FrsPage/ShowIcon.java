package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ShowIcon extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ShowIcon> {
        public String icon;
        public String name;
        public String url;

        public Builder() {
        }

        public Builder(ShowIcon showIcon) {
            super(showIcon);
            if (showIcon == null) {
                return;
            }
            this.icon = showIcon.icon;
            this.name = showIcon.name;
            this.url = showIcon.url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ShowIcon build(boolean z) {
            return new ShowIcon(this, z);
        }
    }

    public ShowIcon(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.icon;
            if (str == null) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            String str2 = builder.name;
            if (str2 == null) {
                this.name = "";
            } else {
                this.name = str2;
            }
            String str3 = builder.url;
            if (str3 == null) {
                this.url = "";
                return;
            } else {
                this.url = str3;
                return;
            }
        }
        this.icon = builder.icon;
        this.name = builder.name;
        this.url = builder.url;
    }
}
