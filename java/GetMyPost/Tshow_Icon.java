package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Tshow_Icon extends Message {
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
    public static final class Builder extends Message.Builder<Tshow_Icon> {
        public String icon;
        public String name;
        public String url;

        public Builder() {
        }

        public Builder(Tshow_Icon tshow_Icon) {
            super(tshow_Icon);
            if (tshow_Icon == null) {
                return;
            }
            this.icon = tshow_Icon.icon;
            this.name = tshow_Icon.name;
            this.url = tshow_Icon.url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Tshow_Icon build(boolean z) {
            return new Tshow_Icon(this, z);
        }
    }

    public Tshow_Icon(Builder builder, boolean z) {
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
