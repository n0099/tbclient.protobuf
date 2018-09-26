package tbclient.GetToken;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ToastInfo extends Message {
    public static final String DEFAULT_BTNTEXT = "";
    public static final String DEFAULT_MESSAGE = "";
    public static final String DEFAULT_SHARETOKEN = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String btntext;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String message;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String sharetoken;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;

    private ToastInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.url == null) {
                this.url = "";
            } else {
                this.url = builder.url;
            }
            if (builder.message == null) {
                this.message = "";
            } else {
                this.message = builder.message;
            }
            if (builder.btntext == null) {
                this.btntext = "";
            } else {
                this.btntext = builder.btntext;
            }
            if (builder.sharetoken == null) {
                this.sharetoken = "";
                return;
            } else {
                this.sharetoken = builder.sharetoken;
                return;
            }
        }
        this.url = builder.url;
        this.message = builder.message;
        this.btntext = builder.btntext;
        this.sharetoken = builder.sharetoken;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ToastInfo> {
        public String btntext;
        public String message;
        public String sharetoken;
        public String url;

        public Builder() {
        }

        public Builder(ToastInfo toastInfo) {
            super(toastInfo);
            if (toastInfo != null) {
                this.url = toastInfo.url;
                this.message = toastInfo.message;
                this.btntext = toastInfo.btntext;
                this.sharetoken = toastInfo.sharetoken;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ToastInfo build(boolean z) {
            return new ToastInfo(this, z);
        }
    }
}
