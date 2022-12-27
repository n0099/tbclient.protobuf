package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class VcodeInfo extends Message {
    public static final String DEFAULT_VCODE_MD5 = "";
    public static final String DEFAULT_VCODE_PIC_URL = "";
    public static final String DEFAULT_VCODE_TYPE = "";
    @ProtoField(tag = 4)
    public final VcodeExtra vcode_extra;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String vcode_md5;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String vcode_pic_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String vcode_type;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<VcodeInfo> {
        public VcodeExtra vcode_extra;
        public String vcode_md5;
        public String vcode_pic_url;
        public String vcode_type;

        public Builder() {
        }

        public Builder(VcodeInfo vcodeInfo) {
            super(vcodeInfo);
            if (vcodeInfo == null) {
                return;
            }
            this.vcode_md5 = vcodeInfo.vcode_md5;
            this.vcode_pic_url = vcodeInfo.vcode_pic_url;
            this.vcode_type = vcodeInfo.vcode_type;
            this.vcode_extra = vcodeInfo.vcode_extra;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VcodeInfo build(boolean z) {
            return new VcodeInfo(this, z);
        }
    }

    public VcodeInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.vcode_md5;
            if (str == null) {
                this.vcode_md5 = "";
            } else {
                this.vcode_md5 = str;
            }
            String str2 = builder.vcode_pic_url;
            if (str2 == null) {
                this.vcode_pic_url = "";
            } else {
                this.vcode_pic_url = str2;
            }
            String str3 = builder.vcode_type;
            if (str3 == null) {
                this.vcode_type = "";
            } else {
                this.vcode_type = str3;
            }
            this.vcode_extra = builder.vcode_extra;
            return;
        }
        this.vcode_md5 = builder.vcode_md5;
        this.vcode_pic_url = builder.vcode_pic_url;
        this.vcode_type = builder.vcode_type;
        this.vcode_extra = builder.vcode_extra;
    }
}
