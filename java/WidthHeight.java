package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class WidthHeight extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer height;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer width;
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<WidthHeight> {
        public Integer height;
        public Integer width;

        public Builder() {
        }

        public Builder(WidthHeight widthHeight) {
            super(widthHeight);
            if (widthHeight == null) {
                return;
            }
            this.width = widthHeight.width;
            this.height = widthHeight.height;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public WidthHeight build(boolean z) {
            return new WidthHeight(this, z);
        }
    }

    public WidthHeight(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.width;
            if (num == null) {
                this.width = DEFAULT_WIDTH;
            } else {
                this.width = num;
            }
            Integer num2 = builder.height;
            if (num2 == null) {
                this.height = DEFAULT_HEIGHT;
                return;
            } else {
                this.height = num2;
                return;
            }
        }
        this.width = builder.width;
        this.height = builder.height;
    }
}
