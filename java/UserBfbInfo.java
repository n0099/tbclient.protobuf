package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
public final class UserBfbInfo extends Message {
    public static final String DEFAULT_BFB_URL = "";
    public static final String DEFAULT_MASTE_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer activity_status;
    @ProtoField(tag = 5)
    public final AndroidBfbSdk android_bfb_sdk;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String bfb_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String maste_url;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer res_no;
    public static final Integer DEFAULT_ACTIVITY_STATUS = 0;
    public static final Integer DEFAULT_RES_NO = 0;

    private UserBfbInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.activity_status == null) {
                this.activity_status = DEFAULT_ACTIVITY_STATUS;
            } else {
                this.activity_status = builder.activity_status;
            }
            if (builder.bfb_url == null) {
                this.bfb_url = "";
            } else {
                this.bfb_url = builder.bfb_url;
            }
            if (builder.maste_url == null) {
                this.maste_url = "";
            } else {
                this.maste_url = builder.maste_url;
            }
            if (builder.res_no == null) {
                this.res_no = DEFAULT_RES_NO;
            } else {
                this.res_no = builder.res_no;
            }
            this.android_bfb_sdk = builder.android_bfb_sdk;
            return;
        }
        this.activity_status = builder.activity_status;
        this.bfb_url = builder.bfb_url;
        this.maste_url = builder.maste_url;
        this.res_no = builder.res_no;
        this.android_bfb_sdk = builder.android_bfb_sdk;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<UserBfbInfo> {
        public Integer activity_status;
        public AndroidBfbSdk android_bfb_sdk;
        public String bfb_url;
        public String maste_url;
        public Integer res_no;

        public Builder() {
        }

        public Builder(UserBfbInfo userBfbInfo) {
            super(userBfbInfo);
            if (userBfbInfo != null) {
                this.activity_status = userBfbInfo.activity_status;
                this.bfb_url = userBfbInfo.bfb_url;
                this.maste_url = userBfbInfo.maste_url;
                this.res_no = userBfbInfo.res_no;
                this.android_bfb_sdk = userBfbInfo.android_bfb_sdk;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserBfbInfo build(boolean z) {
            return new UserBfbInfo(this, z);
        }
    }
}
