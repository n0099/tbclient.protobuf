package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class HighCover extends Message {
    public static final String DEFAULT_PIC_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String pic_url;

    /* synthetic */ HighCover(Builder builder, boolean z, HighCover highCover) {
        this(builder, z);
    }

    private HighCover(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.pic_url == null) {
                this.pic_url = "";
                return;
            } else {
                this.pic_url = builder.pic_url;
                return;
            }
        }
        this.pic_url = builder.pic_url;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<HighCover> {
        public String pic_url;

        public Builder() {
        }

        public Builder(HighCover highCover) {
            super(highCover);
            if (highCover != null) {
                this.pic_url = highCover.pic_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HighCover build(boolean z) {
            return new HighCover(this, z, null);
        }
    }
}
