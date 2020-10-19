package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class MediaNum extends Message {
    public static final Integer DEFAULT_PIC = 0;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer pic;

    private MediaNum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.pic == null) {
                this.pic = DEFAULT_PIC;
                return;
            } else {
                this.pic = builder.pic;
                return;
            }
        }
        this.pic = builder.pic;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<MediaNum> {
        public Integer pic;

        public Builder() {
        }

        public Builder(MediaNum mediaNum) {
            super(mediaNum);
            if (mediaNum != null) {
                this.pic = mediaNum.pic;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MediaNum build(boolean z) {
            return new MediaNum(this, z);
        }
    }
}
