package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
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

    private Tshow_Icon(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.icon == null) {
                this.icon = "";
            } else {
                this.icon = builder.icon;
            }
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.url == null) {
                this.url = "";
                return;
            } else {
                this.url = builder.url;
                return;
            }
        }
        this.icon = builder.icon;
        this.name = builder.name;
        this.url = builder.url;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<Tshow_Icon> {
        public String icon;
        public String name;
        public String url;

        public Builder() {
        }

        public Builder(Tshow_Icon tshow_Icon) {
            super(tshow_Icon);
            if (tshow_Icon != null) {
                this.icon = tshow_Icon.icon;
                this.name = tshow_Icon.name;
                this.url = tshow_Icon.url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Tshow_Icon build(boolean z) {
            return new Tshow_Icon(this, z);
        }
    }
}
