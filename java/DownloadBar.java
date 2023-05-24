package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class DownloadBar extends Message {
    public static final String DEFAULT_BUTTON_TEXT = "";
    public static final String DEFAULT_GUIDE_TEXT = "";
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_SCHEMA = "";
    public static final String DEFAULT_TYPE = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String button_text;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String guide_text;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String schema;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String type;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DownloadBar> {
        public String button_text;
        public String guide_text;
        public String icon;
        public String schema;
        public String type;

        public Builder() {
        }

        public Builder(DownloadBar downloadBar) {
            super(downloadBar);
            if (downloadBar == null) {
                return;
            }
            this.type = downloadBar.type;
            this.button_text = downloadBar.button_text;
            this.schema = downloadBar.schema;
            this.guide_text = downloadBar.guide_text;
            this.icon = downloadBar.icon;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DownloadBar build(boolean z) {
            return new DownloadBar(this, z);
        }
    }

    public DownloadBar(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.type;
            if (str == null) {
                this.type = "";
            } else {
                this.type = str;
            }
            String str2 = builder.button_text;
            if (str2 == null) {
                this.button_text = "";
            } else {
                this.button_text = str2;
            }
            String str3 = builder.schema;
            if (str3 == null) {
                this.schema = "";
            } else {
                this.schema = str3;
            }
            String str4 = builder.guide_text;
            if (str4 == null) {
                this.guide_text = "";
            } else {
                this.guide_text = str4;
            }
            String str5 = builder.icon;
            if (str5 == null) {
                this.icon = "";
                return;
            } else {
                this.icon = str5;
                return;
            }
        }
        this.type = builder.type;
        this.button_text = builder.button_text;
        this.schema = builder.schema;
        this.guide_text = builder.guide_text;
        this.icon = builder.icon;
    }
}
