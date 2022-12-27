package tbclient.GetWebviewCacheInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
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

    /* loaded from: classes9.dex */
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
            if (offpack == null) {
                return;
            }
            this.mod_name = offpack.mod_name;
            this.src = offpack.src;
            this.md5 = offpack.md5;
            this.webview_version = offpack.webview_version;
            this.is_use = offpack.is_use;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Offpack build(boolean z) {
            return new Offpack(this, z);
        }
    }

    public Offpack(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.mod_name;
            if (str == null) {
                this.mod_name = "";
            } else {
                this.mod_name = str;
            }
            String str2 = builder.src;
            if (str2 == null) {
                this.src = "";
            } else {
                this.src = str2;
            }
            String str3 = builder.md5;
            if (str3 == null) {
                this.md5 = "";
            } else {
                this.md5 = str3;
            }
            String str4 = builder.webview_version;
            if (str4 == null) {
                this.webview_version = "";
            } else {
                this.webview_version = str4;
            }
            Integer num = builder.is_use;
            if (num == null) {
                this.is_use = DEFAULT_IS_USE;
                return;
            } else {
                this.is_use = num;
                return;
            }
        }
        this.mod_name = builder.mod_name;
        this.src = builder.src;
        this.md5 = builder.md5;
        this.webview_version = builder.webview_version;
        this.is_use = builder.is_use;
    }
}
