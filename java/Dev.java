package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class Dev extends Message {
    public static final String DEFAULT_CUID = "";
    public static final String DEFAULT_OS = "";
    public static final String DEFAULT_VERSION = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String cuid;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String os;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String version;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<Dev> {
        public String cuid;
        public String os;
        public String version;

        public Builder() {
        }

        public Builder(Dev dev) {
            super(dev);
            if (dev == null) {
                return;
            }
            this.os = dev.os;
            this.version = dev.version;
            this.cuid = dev.cuid;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Dev build(boolean z) {
            return new Dev(this, z);
        }
    }

    public Dev(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.os;
            if (str == null) {
                this.os = "";
            } else {
                this.os = str;
            }
            String str2 = builder.version;
            if (str2 == null) {
                this.version = "";
            } else {
                this.version = str2;
            }
            String str3 = builder.cuid;
            if (str3 == null) {
                this.cuid = "";
                return;
            } else {
                this.cuid = str3;
                return;
            }
        }
        this.os = builder.os;
        this.version = builder.version;
        this.cuid = builder.cuid;
    }
}
