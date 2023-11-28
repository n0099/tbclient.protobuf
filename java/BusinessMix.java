package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class BusinessMix extends Message {
    public static final String DEFAULT_PACKAGE_NAME = "";
    public static final String DEFAULT_SCHEME = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer jump_type;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer mix_type;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String package_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String scheme;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;
    public static final Integer DEFAULT_MIX_TYPE = 0;
    public static final Integer DEFAULT_JUMP_TYPE = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<BusinessMix> {
        public Integer jump_type;
        public Integer mix_type;
        public String package_name;
        public String scheme;
        public String url;

        public Builder() {
        }

        public Builder(BusinessMix businessMix) {
            super(businessMix);
            if (businessMix == null) {
                return;
            }
            this.mix_type = businessMix.mix_type;
            this.url = businessMix.url;
            this.scheme = businessMix.scheme;
            this.jump_type = businessMix.jump_type;
            this.package_name = businessMix.package_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BusinessMix build(boolean z) {
            return new BusinessMix(this, z);
        }
    }

    public BusinessMix(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.mix_type;
            if (num == null) {
                this.mix_type = DEFAULT_MIX_TYPE;
            } else {
                this.mix_type = num;
            }
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            String str2 = builder.scheme;
            if (str2 == null) {
                this.scheme = "";
            } else {
                this.scheme = str2;
            }
            Integer num2 = builder.jump_type;
            if (num2 == null) {
                this.jump_type = DEFAULT_JUMP_TYPE;
            } else {
                this.jump_type = num2;
            }
            String str3 = builder.package_name;
            if (str3 == null) {
                this.package_name = "";
                return;
            } else {
                this.package_name = str3;
                return;
            }
        }
        this.mix_type = builder.mix_type;
        this.url = builder.url;
        this.scheme = builder.scheme;
        this.jump_type = builder.jump_type;
        this.package_name = builder.package_name;
    }
}
