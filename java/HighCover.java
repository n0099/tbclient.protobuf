package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class HighCover extends Message {
    public static final String DEFAULT_PIC_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String pic_url;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<HighCover> {
        public String pic_url;

        public Builder() {
        }

        public Builder(HighCover highCover) {
            super(highCover);
            if (highCover == null) {
                return;
            }
            this.pic_url = highCover.pic_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HighCover build(boolean z) {
            return new HighCover(this, z);
        }
    }

    public HighCover(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.pic_url;
            if (str == null) {
                this.pic_url = "";
                return;
            } else {
                this.pic_url = str;
                return;
            }
        }
        this.pic_url = builder.pic_url;
    }
}
