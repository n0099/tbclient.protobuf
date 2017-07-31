package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class AndroidBfbSdk extends Message {
    public static final String DEFAULT_ACTIVITY_NO = "";
    public static final String DEFAULT_ORDER_NO = "";
    public static final String DEFAULT_RETURN_URL = "";
    public static final String DEFAULT_SIGN = "";
    public static final String DEFAULT_VERSION = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String activity_no;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String order_no;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String return_url;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String sign;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer sign_method;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer sp_no;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String version;
    public static final Integer DEFAULT_SP_NO = 0;
    public static final Integer DEFAULT_SIGN_METHOD = 0;

    private AndroidBfbSdk(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.sp_no == null) {
                this.sp_no = DEFAULT_SP_NO;
            } else {
                this.sp_no = builder.sp_no;
            }
            if (builder.version == null) {
                this.version = "";
            } else {
                this.version = builder.version;
            }
            if (builder.activity_no == null) {
                this.activity_no = "";
            } else {
                this.activity_no = builder.activity_no;
            }
            if (builder.order_no == null) {
                this.order_no = "";
            } else {
                this.order_no = builder.order_no;
            }
            if (builder.return_url == null) {
                this.return_url = "";
            } else {
                this.return_url = builder.return_url;
            }
            if (builder.sign == null) {
                this.sign = "";
            } else {
                this.sign = builder.sign;
            }
            if (builder.sign_method == null) {
                this.sign_method = DEFAULT_SIGN_METHOD;
                return;
            } else {
                this.sign_method = builder.sign_method;
                return;
            }
        }
        this.sp_no = builder.sp_no;
        this.version = builder.version;
        this.activity_no = builder.activity_no;
        this.order_no = builder.order_no;
        this.return_url = builder.return_url;
        this.sign = builder.sign;
        this.sign_method = builder.sign_method;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<AndroidBfbSdk> {
        public String activity_no;
        public String order_no;
        public String return_url;
        public String sign;
        public Integer sign_method;
        public Integer sp_no;
        public String version;

        public Builder() {
        }

        public Builder(AndroidBfbSdk androidBfbSdk) {
            super(androidBfbSdk);
            if (androidBfbSdk != null) {
                this.sp_no = androidBfbSdk.sp_no;
                this.version = androidBfbSdk.version;
                this.activity_no = androidBfbSdk.activity_no;
                this.order_no = androidBfbSdk.order_no;
                this.return_url = androidBfbSdk.return_url;
                this.sign = androidBfbSdk.sign;
                this.sign_method = androidBfbSdk.sign_method;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AndroidBfbSdk build(boolean z) {
            return new AndroidBfbSdk(this, z);
        }
    }
}
