package tbclient.GetWebviewCacheInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class Offpack extends Message {
    public static final Integer DEFAULT_IS_USE = 0;
    public static final String DEFAULT_MD5 = "";
    public static final String DEFAULT_MOD_NAME = "";
    public static final String DEFAULT_SRC = "";
    public static final String DEFAULT_WEBVIEW_VERSION = "";
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer is_use;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String md5;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String mod_name;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String src;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String webview_version;

    private Offpack(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.mod_name == null) {
                this.mod_name = "";
            } else {
                this.mod_name = builder.mod_name;
            }
            if (builder.src == null) {
                this.src = "";
            } else {
                this.src = builder.src;
            }
            if (builder.md5 == null) {
                this.md5 = "";
            } else {
                this.md5 = builder.md5;
            }
            if (builder.webview_version == null) {
                this.webview_version = "";
            } else {
                this.webview_version = builder.webview_version;
            }
            if (builder.is_use == null) {
                this.is_use = DEFAULT_IS_USE;
                return;
            } else {
                this.is_use = builder.is_use;
                return;
            }
        }
        this.mod_name = builder.mod_name;
        this.src = builder.src;
        this.md5 = builder.md5;
        this.webview_version = builder.webview_version;
        this.is_use = builder.is_use;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<Offpack> {
        public Integer is_use;
        public String md5;
        public String mod_name;
        public String src;
        public String webview_version;

        public Builder() {
        }

        public Builder(Offpack offpack) {
            super(offpack);
            if (offpack != null) {
                this.mod_name = offpack.mod_name;
                this.src = offpack.src;
                this.md5 = offpack.md5;
                this.webview_version = offpack.webview_version;
                this.is_use = offpack.is_use;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Offpack build(boolean z) {
            return new Offpack(this, z);
        }
    }
}
