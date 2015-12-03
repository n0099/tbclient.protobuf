package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GodInfo extends Message {
    public static final String DEFAULT_INTRO = "";
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long fid;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String intro;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Long DEFAULT_FID = 0L;

    /* synthetic */ GodInfo(Builder builder, boolean z, GodInfo godInfo) {
        this(builder, z);
    }

    private GodInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.intro == null) {
                this.intro = "";
            } else {
                this.intro = builder.intro;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.fid == null) {
                this.fid = DEFAULT_FID;
                return;
            } else {
                this.fid = builder.fid;
                return;
            }
        }
        this.id = builder.id;
        this.intro = builder.intro;
        this.type = builder.type;
        this.fid = builder.fid;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GodInfo> {
        public Long fid;
        public Long id;
        public String intro;
        public Integer type;

        public Builder() {
        }

        public Builder(GodInfo godInfo) {
            super(godInfo);
            if (godInfo != null) {
                this.id = godInfo.id;
                this.intro = godInfo.intro;
                this.type = godInfo.type;
                this.fid = godInfo.fid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GodInfo build(boolean z) {
            return new GodInfo(this, z, null);
        }
    }
}
