package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class SmartApp extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_H5_URL = "";
    public static final String DEFAULT_ID = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PIC = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String h5_url;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String pic;

    private SmartApp(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.avatar == null) {
                this.avatar = "";
            } else {
                this.avatar = builder.avatar;
            }
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder._abstract == null) {
                this._abstract = "";
            } else {
                this._abstract = builder._abstract;
            }
            if (builder.pic == null) {
                this.pic = "";
            } else {
                this.pic = builder.pic;
            }
            if (builder.h5_url == null) {
                this.h5_url = "";
            } else {
                this.h5_url = builder.h5_url;
            }
            if (builder.id == null) {
                this.id = "";
            } else {
                this.id = builder.id;
            }
            if (builder.link == null) {
                this.link = "";
                return;
            } else {
                this.link = builder.link;
                return;
            }
        }
        this.avatar = builder.avatar;
        this.name = builder.name;
        this._abstract = builder._abstract;
        this.pic = builder.pic;
        this.h5_url = builder.h5_url;
        this.id = builder.id;
        this.link = builder.link;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<SmartApp> {
        public String _abstract;
        public String avatar;
        public String h5_url;
        public String id;
        public String link;
        public String name;
        public String pic;

        public Builder() {
        }

        public Builder(SmartApp smartApp) {
            super(smartApp);
            if (smartApp != null) {
                this.avatar = smartApp.avatar;
                this.name = smartApp.name;
                this._abstract = smartApp._abstract;
                this.pic = smartApp.pic;
                this.h5_url = smartApp.h5_url;
                this.id = smartApp.id;
                this.link = smartApp.link;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SmartApp build(boolean z) {
            return new SmartApp(this, z);
        }
    }
}
