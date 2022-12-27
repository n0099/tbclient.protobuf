package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class SkinInfo extends Message {
    public static final String DEFAULT_MONITOR_ID = "";
    public static final String DEFAULT_OBJ_ID = "";
    public static final String DEFAULT_SKIN = "";
    public static final String DEFAULT_SKIN_SIZE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String monitor_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String obj_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String skin;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String skin_size;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SkinInfo> {
        public String monitor_id;
        public String obj_id;
        public String skin;
        public String skin_size;
        public String url;

        public Builder() {
        }

        public Builder(SkinInfo skinInfo) {
            super(skinInfo);
            if (skinInfo == null) {
                return;
            }
            this.skin = skinInfo.skin;
            this.skin_size = skinInfo.skin_size;
            this.url = skinInfo.url;
            this.obj_id = skinInfo.obj_id;
            this.monitor_id = skinInfo.monitor_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SkinInfo build(boolean z) {
            return new SkinInfo(this, z);
        }
    }

    public SkinInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.skin;
            if (str == null) {
                this.skin = "";
            } else {
                this.skin = str;
            }
            String str2 = builder.skin_size;
            if (str2 == null) {
                this.skin_size = "";
            } else {
                this.skin_size = str2;
            }
            String str3 = builder.url;
            if (str3 == null) {
                this.url = "";
            } else {
                this.url = str3;
            }
            String str4 = builder.obj_id;
            if (str4 == null) {
                this.obj_id = "";
            } else {
                this.obj_id = str4;
            }
            String str5 = builder.monitor_id;
            if (str5 == null) {
                this.monitor_id = "";
                return;
            } else {
                this.monitor_id = str5;
                return;
            }
        }
        this.skin = builder.skin;
        this.skin_size = builder.skin_size;
        this.url = builder.url;
        this.obj_id = builder.obj_id;
        this.monitor_id = builder.monitor_id;
    }
}
