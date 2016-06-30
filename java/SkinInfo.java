package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
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

    /* synthetic */ SkinInfo(Builder builder, boolean z, SkinInfo skinInfo) {
        this(builder, z);
    }

    private SkinInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.skin == null) {
                this.skin = "";
            } else {
                this.skin = builder.skin;
            }
            if (builder.skin_size == null) {
                this.skin_size = "";
            } else {
                this.skin_size = builder.skin_size;
            }
            if (builder.url == null) {
                this.url = "";
            } else {
                this.url = builder.url;
            }
            if (builder.obj_id == null) {
                this.obj_id = "";
            } else {
                this.obj_id = builder.obj_id;
            }
            if (builder.monitor_id == null) {
                this.monitor_id = "";
                return;
            } else {
                this.monitor_id = builder.monitor_id;
                return;
            }
        }
        this.skin = builder.skin;
        this.skin_size = builder.skin_size;
        this.url = builder.url;
        this.obj_id = builder.obj_id;
        this.monitor_id = builder.monitor_id;
    }

    /* loaded from: classes.dex */
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
            if (skinInfo != null) {
                this.skin = skinInfo.skin;
                this.skin_size = skinInfo.skin_size;
                this.url = skinInfo.url;
                this.obj_id = skinInfo.obj_id;
                this.monitor_id = skinInfo.monitor_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SkinInfo build(boolean z) {
            return new SkinInfo(this, z, null);
        }
    }
}
