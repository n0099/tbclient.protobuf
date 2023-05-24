package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class DebugInfo extends Message {
    public static final String DEFAULT_ABSTRCT = "";
    public static final String DEFAULT_ACTION = "";
    public static final String DEFAULT_ERROR_CODE = "";
    public static final String DEFAULT_ERROR_MESSAGE = "";
    public static final String DEFAULT_EXT1 = "";
    public static final String DEFAULT_EXT2 = "";
    public static final String DEFAULT_EXT3 = "";
    public static final String DEFAULT_EXT4 = "";
    public static final Long DEFAULT_ID = 0L;
    public static final String DEFAULT_MODULE = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String abstrct;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String action;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String error_code;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String error_message;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String ext1;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String ext2;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String ext3;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String ext4;
    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String module;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DebugInfo> {
        public String abstrct;
        public String action;
        public String error_code;
        public String error_message;
        public String ext1;
        public String ext2;
        public String ext3;
        public String ext4;
        public Long id;
        public String module;
        public String title;

        public Builder() {
        }

        public Builder(DebugInfo debugInfo) {
            super(debugInfo);
            if (debugInfo == null) {
                return;
            }
            this.module = debugInfo.module;
            this.action = debugInfo.action;
            this.error_code = debugInfo.error_code;
            this.error_message = debugInfo.error_message;
            this.ext1 = debugInfo.ext1;
            this.ext2 = debugInfo.ext2;
            this.ext3 = debugInfo.ext3;
            this.ext4 = debugInfo.ext4;
            this.id = debugInfo.id;
            this.title = debugInfo.title;
            this.abstrct = debugInfo.abstrct;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DebugInfo build(boolean z) {
            return new DebugInfo(this, z);
        }
    }

    public DebugInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.module;
            if (str == null) {
                this.module = "";
            } else {
                this.module = str;
            }
            String str2 = builder.action;
            if (str2 == null) {
                this.action = "";
            } else {
                this.action = str2;
            }
            String str3 = builder.error_code;
            if (str3 == null) {
                this.error_code = "";
            } else {
                this.error_code = str3;
            }
            String str4 = builder.error_message;
            if (str4 == null) {
                this.error_message = "";
            } else {
                this.error_message = str4;
            }
            String str5 = builder.ext1;
            if (str5 == null) {
                this.ext1 = "";
            } else {
                this.ext1 = str5;
            }
            String str6 = builder.ext2;
            if (str6 == null) {
                this.ext2 = "";
            } else {
                this.ext2 = str6;
            }
            String str7 = builder.ext3;
            if (str7 == null) {
                this.ext3 = "";
            } else {
                this.ext3 = str7;
            }
            String str8 = builder.ext4;
            if (str8 == null) {
                this.ext4 = "";
            } else {
                this.ext4 = str8;
            }
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            String str9 = builder.title;
            if (str9 == null) {
                this.title = "";
            } else {
                this.title = str9;
            }
            String str10 = builder.abstrct;
            if (str10 == null) {
                this.abstrct = "";
                return;
            } else {
                this.abstrct = str10;
                return;
            }
        }
        this.module = builder.module;
        this.action = builder.action;
        this.error_code = builder.error_code;
        this.error_message = builder.error_message;
        this.ext1 = builder.ext1;
        this.ext2 = builder.ext2;
        this.ext3 = builder.ext3;
        this.ext4 = builder.ext4;
        this.id = builder.id;
        this.title = builder.title;
        this.abstrct = builder.abstrct;
    }
}
