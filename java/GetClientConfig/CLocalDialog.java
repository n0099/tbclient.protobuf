package tbclient.GetClientConfig;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class CLocalDialog extends Message {
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PICTURE = "";
    public static final Integer DEFAULT_SHOW = 0;
    public static final String DEFAULT_TIME = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String picture;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer show;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String time;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String url;

    /* synthetic */ CLocalDialog(Builder builder, boolean z, CLocalDialog cLocalDialog) {
        this(builder, z);
    }

    private CLocalDialog(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.picture == null) {
                this.picture = "";
            } else {
                this.picture = builder.picture;
            }
            if (builder.show == null) {
                this.show = DEFAULT_SHOW;
            } else {
                this.show = builder.show;
            }
            if (builder.time == null) {
                this.time = "";
            } else {
                this.time = builder.time;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.url == null) {
                this.url = "";
            } else {
                this.url = builder.url;
            }
            if (builder.name == null) {
                this.name = "";
                return;
            } else {
                this.name = builder.name;
                return;
            }
        }
        this.picture = builder.picture;
        this.show = builder.show;
        this.time = builder.time;
        this.title = builder.title;
        this.url = builder.url;
        this.name = builder.name;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<CLocalDialog> {
        public String name;
        public String picture;
        public Integer show;
        public String time;
        public String title;
        public String url;

        public Builder() {
        }

        public Builder(CLocalDialog cLocalDialog) {
            super(cLocalDialog);
            if (cLocalDialog != null) {
                this.picture = cLocalDialog.picture;
                this.show = cLocalDialog.show;
                this.time = cLocalDialog.time;
                this.title = cLocalDialog.title;
                this.url = cLocalDialog.url;
                this.name = cLocalDialog.name;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CLocalDialog build(boolean z) {
            return new CLocalDialog(this, z, null);
        }
    }
}
