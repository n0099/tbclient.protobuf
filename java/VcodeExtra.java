package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class VcodeExtra extends Message {
    public static final String DEFAULT_ENDPOINT = "";
    public static final String DEFAULT_SLIDEENDPOINT = "";
    public static final String DEFAULT_SLIDEIMG = "";
    public static final String DEFAULT_SUCCESSIMG = "";
    public static final String DEFAULT_TEXTIMG = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String endpoint;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String slideendpoint;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String slideimg;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String successimg;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String textimg;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<VcodeExtra> {
        public String endpoint;
        public String slideendpoint;
        public String slideimg;
        public String successimg;
        public String textimg;

        public Builder() {
        }

        public Builder(VcodeExtra vcodeExtra) {
            super(vcodeExtra);
            if (vcodeExtra == null) {
                return;
            }
            this.textimg = vcodeExtra.textimg;
            this.slideimg = vcodeExtra.slideimg;
            this.endpoint = vcodeExtra.endpoint;
            this.successimg = vcodeExtra.successimg;
            this.slideendpoint = vcodeExtra.slideendpoint;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VcodeExtra build(boolean z) {
            return new VcodeExtra(this, z);
        }
    }

    public VcodeExtra(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.textimg;
            if (str == null) {
                this.textimg = "";
            } else {
                this.textimg = str;
            }
            String str2 = builder.slideimg;
            if (str2 == null) {
                this.slideimg = "";
            } else {
                this.slideimg = str2;
            }
            String str3 = builder.endpoint;
            if (str3 == null) {
                this.endpoint = "";
            } else {
                this.endpoint = str3;
            }
            String str4 = builder.successimg;
            if (str4 == null) {
                this.successimg = "";
            } else {
                this.successimg = str4;
            }
            String str5 = builder.slideendpoint;
            if (str5 == null) {
                this.slideendpoint = "";
                return;
            } else {
                this.slideendpoint = str5;
                return;
            }
        }
        this.textimg = builder.textimg;
        this.slideimg = builder.slideimg;
        this.endpoint = builder.endpoint;
        this.successimg = builder.successimg;
        this.slideendpoint = builder.slideendpoint;
    }
}
