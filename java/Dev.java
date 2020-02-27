package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
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

    private Dev(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.os == null) {
                this.os = "";
            } else {
                this.os = builder.os;
            }
            if (builder.version == null) {
                this.version = "";
            } else {
                this.version = builder.version;
            }
            if (builder.cuid == null) {
                this.cuid = "";
                return;
            } else {
                this.cuid = builder.cuid;
                return;
            }
        }
        this.os = builder.os;
        this.version = builder.version;
        this.cuid = builder.cuid;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Dev> {
        public String cuid;
        public String os;
        public String version;

        public Builder() {
        }

        public Builder(Dev dev) {
            super(dev);
            if (dev != null) {
                this.os = dev.os;
                this.version = dev.version;
                this.cuid = dev.cuid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Dev build(boolean z) {
            return new Dev(this, z);
        }
    }
}
