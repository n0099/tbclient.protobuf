package tbclient.SimpleData;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class BrandImage extends Message {
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer height;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer width;
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<BrandImage> {
        public Integer height;
        public String url;
        public Integer width;

        public Builder() {
        }

        public Builder(BrandImage brandImage) {
            super(brandImage);
            if (brandImage == null) {
                return;
            }
            this.url = brandImage.url;
            this.width = brandImage.width;
            this.height = brandImage.height;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BrandImage build(boolean z) {
            return new BrandImage(this, z);
        }
    }

    public BrandImage(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
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
        this.url = builder.url;
        this.width = builder.width;
        this.height = builder.height;
    }
}
