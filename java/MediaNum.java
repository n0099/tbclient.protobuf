package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class MediaNum extends Message {
    public static final Integer DEFAULT_PIC = 0;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer pic;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<MediaNum> {
        public Integer pic;

        public Builder() {
        }

        public Builder(MediaNum mediaNum) {
            super(mediaNum);
            if (mediaNum == null) {
                return;
            }
            this.pic = mediaNum.pic;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MediaNum build(boolean z) {
            return new MediaNum(this, z);
        }
    }

    public MediaNum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.pic;
            if (num == null) {
                this.pic = DEFAULT_PIC;
                return;
            } else {
                this.pic = num;
                return;
            }
        }
        this.pic = builder.pic;
    }
}
