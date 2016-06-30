package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class DealMedia extends Message {
    public static final String DEFAULT_BIG_PIC = "";
    public static final String DEFAULT_SMALL_PIC = "";
    public static final Integer DEFAULT_TYPE = 0;
    public static final String DEFAULT_WATER_PIC = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String big_pic;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String small_pic;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String water_pic;

    /* synthetic */ DealMedia(Builder builder, boolean z, DealMedia dealMedia) {
        this(builder, z);
    }

    private DealMedia(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.small_pic == null) {
                this.small_pic = "";
            } else {
                this.small_pic = builder.small_pic;
            }
            if (builder.big_pic == null) {
                this.big_pic = "";
            } else {
                this.big_pic = builder.big_pic;
            }
            if (builder.water_pic == null) {
                this.water_pic = "";
                return;
            } else {
                this.water_pic = builder.water_pic;
                return;
            }
        }
        this.type = builder.type;
        this.small_pic = builder.small_pic;
        this.big_pic = builder.big_pic;
        this.water_pic = builder.water_pic;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DealMedia> {
        public String big_pic;
        public String small_pic;
        public Integer type;
        public String water_pic;

        public Builder() {
        }

        public Builder(DealMedia dealMedia) {
            super(dealMedia);
            if (dealMedia != null) {
                this.type = dealMedia.type;
                this.small_pic = dealMedia.small_pic;
                this.big_pic = dealMedia.big_pic;
                this.water_pic = dealMedia.water_pic;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DealMedia build(boolean z) {
            return new DealMedia(this, z, null);
        }
    }
}
