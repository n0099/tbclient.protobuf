package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
public final class NativeApp extends Message {
    public static final String DEFAULT_DOWNLOAD_AND = "";
    public static final String DEFAULT_DOWNLOAD_IOS = "";
    public static final String DEFAULT_JUMP_AND = "";
    public static final String DEFAULT_JUMP_IOS = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String download_and;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String download_ios;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String jump_and;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String jump_ios;

    private NativeApp(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.jump_and == null) {
                this.jump_and = "";
            } else {
                this.jump_and = builder.jump_and;
            }
            if (builder.jump_ios == null) {
                this.jump_ios = "";
            } else {
                this.jump_ios = builder.jump_ios;
            }
            if (builder.download_and == null) {
                this.download_and = "";
            } else {
                this.download_and = builder.download_and;
            }
            if (builder.download_ios == null) {
                this.download_ios = "";
                return;
            } else {
                this.download_ios = builder.download_ios;
                return;
            }
        }
        this.jump_and = builder.jump_and;
        this.jump_ios = builder.jump_ios;
        this.download_and = builder.download_and;
        this.download_ios = builder.download_ios;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<NativeApp> {
        public String download_and;
        public String download_ios;
        public String jump_and;
        public String jump_ios;

        public Builder() {
        }

        public Builder(NativeApp nativeApp) {
            super(nativeApp);
            if (nativeApp != null) {
                this.jump_and = nativeApp.jump_and;
                this.jump_ios = nativeApp.jump_ios;
                this.download_and = nativeApp.download_and;
                this.download_ios = nativeApp.download_ios;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NativeApp build(boolean z) {
            return new NativeApp(this, z);
        }
    }
}
