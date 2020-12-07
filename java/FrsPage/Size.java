package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class Size extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer height;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer width;
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;

    private Size(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.width == null) {
                this.width = DEFAULT_WIDTH;
            } else {
                this.width = builder.width;
            }
            if (builder.height == null) {
                this.height = DEFAULT_HEIGHT;
                return;
            } else {
                this.height = builder.height;
                return;
            }
        }
        this.width = builder.width;
        this.height = builder.height;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<Size> {
        public Integer height;
        public Integer width;

        public Builder() {
        }

        public Builder(Size size) {
            super(size);
            if (size != null) {
                this.width = size.width;
                this.height = size.height;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Size build(boolean z) {
            return new Size(this, z);
        }
    }
}
