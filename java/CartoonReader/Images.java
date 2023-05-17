package tbclient.CartoonReader;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class Images extends Message {
    public static final String DEFAULT_IMG_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer height;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer width;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Integer DEFAULT_WIDTH = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<Images> {
        public Integer height;
        public String img_url;
        public Integer width;

        public Builder() {
        }

        public Builder(Images images) {
            super(images);
            if (images == null) {
                return;
            }
            this.img_url = images.img_url;
            this.height = images.height;
            this.width = images.width;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Images build(boolean z) {
            return new Images(this, z);
        }
    }

    public Images(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.img_url;
            if (str == null) {
                this.img_url = "";
            } else {
                this.img_url = str;
            }
            Integer num = builder.height;
            if (num == null) {
                this.height = DEFAULT_HEIGHT;
            } else {
                this.height = num;
            }
            Integer num2 = builder.width;
            if (num2 == null) {
                this.width = DEFAULT_WIDTH;
                return;
            } else {
                this.width = num2;
                return;
            }
        }
        this.img_url = builder.img_url;
        this.height = builder.height;
        this.width = builder.width;
    }
}
