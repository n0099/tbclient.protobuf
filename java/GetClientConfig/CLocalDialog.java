package tbclient.GetClientConfig;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class CLocalDialog extends Message {
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PICTURE = "";
    public static final Integer DEFAULT_SHOW = 0;
    public static final String DEFAULT_TIME = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    public static final String DEFAULT_URL_IOS = "";
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
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String url_ios;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<CLocalDialog> {
        public String name;
        public String picture;
        public Integer show;
        public String time;
        public String title;
        public String url;
        public String url_ios;

        public Builder() {
        }

        public Builder(CLocalDialog cLocalDialog) {
            super(cLocalDialog);
            if (cLocalDialog == null) {
                return;
            }
            this.picture = cLocalDialog.picture;
            this.show = cLocalDialog.show;
            this.time = cLocalDialog.time;
            this.title = cLocalDialog.title;
            this.url = cLocalDialog.url;
            this.name = cLocalDialog.name;
            this.url_ios = cLocalDialog.url_ios;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CLocalDialog build(boolean z) {
            return new CLocalDialog(this, z);
        }
    }

    public CLocalDialog(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.picture;
            if (str == null) {
                this.picture = "";
            } else {
                this.picture = str;
            }
            Integer num = builder.show;
            if (num == null) {
                this.show = DEFAULT_SHOW;
            } else {
                this.show = num;
            }
            String str2 = builder.time;
            if (str2 == null) {
                this.time = "";
            } else {
                this.time = str2;
            }
            String str3 = builder.title;
            if (str3 == null) {
                this.title = "";
            } else {
                this.title = str3;
            }
            String str4 = builder.url;
            if (str4 == null) {
                this.url = "";
            } else {
                this.url = str4;
            }
            String str5 = builder.name;
            if (str5 == null) {
                this.name = "";
            } else {
                this.name = str5;
            }
            String str6 = builder.url_ios;
            if (str6 == null) {
                this.url_ios = "";
                return;
            } else {
                this.url_ios = str6;
                return;
            }
        }
        this.picture = builder.picture;
        this.show = builder.show;
        this.time = builder.time;
        this.title = builder.title;
        this.url = builder.url;
        this.name = builder.name;
        this.url_ios = builder.url_ios;
    }
}
