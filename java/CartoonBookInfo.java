package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class CartoonBookInfo extends Message {
    public static final Long DEFAULT_CARTOON_ID = 0L;
    public static final String DEFAULT_CARTOON_NAME = "";
    public static final String DEFAULT_COVER_IMG = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long cartoon_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String cartoon_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String cover_img;

    /* synthetic */ CartoonBookInfo(Builder builder, boolean z, CartoonBookInfo cartoonBookInfo) {
        this(builder, z);
    }

    private CartoonBookInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.cartoon_id == null) {
                this.cartoon_id = DEFAULT_CARTOON_ID;
            } else {
                this.cartoon_id = builder.cartoon_id;
            }
            if (builder.cartoon_name == null) {
                this.cartoon_name = "";
            } else {
                this.cartoon_name = builder.cartoon_name;
            }
            if (builder.cover_img == null) {
                this.cover_img = "";
                return;
            } else {
                this.cover_img = builder.cover_img;
                return;
            }
        }
        this.cartoon_id = builder.cartoon_id;
        this.cartoon_name = builder.cartoon_name;
        this.cover_img = builder.cover_img;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<CartoonBookInfo> {
        public Long cartoon_id;
        public String cartoon_name;
        public String cover_img;

        public Builder() {
        }

        public Builder(CartoonBookInfo cartoonBookInfo) {
            super(cartoonBookInfo);
            if (cartoonBookInfo != null) {
                this.cartoon_id = cartoonBookInfo.cartoon_id;
                this.cartoon_name = cartoonBookInfo.cartoon_name;
                this.cover_img = cartoonBookInfo.cover_img;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CartoonBookInfo build(boolean z) {
            return new CartoonBookInfo(this, z, null);
        }
    }
}
