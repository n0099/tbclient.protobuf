package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class CartoonBookInfo extends Message {
    public static final String DEFAULT_CARTOON_NAME = "";
    public static final String DEFAULT_COVER_IMG = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long cartoon_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String cartoon_name;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer cartoon_vip;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String cover_img;
    public static final Long DEFAULT_CARTOON_ID = 0L;
    public static final Integer DEFAULT_CARTOON_VIP = 0;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<CartoonBookInfo> {
        public Long cartoon_id;
        public String cartoon_name;
        public Integer cartoon_vip;
        public String cover_img;

        public Builder() {
        }

        public Builder(CartoonBookInfo cartoonBookInfo) {
            super(cartoonBookInfo);
            if (cartoonBookInfo == null) {
                return;
            }
            this.cartoon_id = cartoonBookInfo.cartoon_id;
            this.cartoon_name = cartoonBookInfo.cartoon_name;
            this.cover_img = cartoonBookInfo.cover_img;
            this.cartoon_vip = cartoonBookInfo.cartoon_vip;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CartoonBookInfo build(boolean z) {
            return new CartoonBookInfo(this, z);
        }
    }

    public CartoonBookInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.cartoon_id;
            if (l == null) {
                this.cartoon_id = DEFAULT_CARTOON_ID;
            } else {
                this.cartoon_id = l;
            }
            String str = builder.cartoon_name;
            if (str == null) {
                this.cartoon_name = "";
            } else {
                this.cartoon_name = str;
            }
            String str2 = builder.cover_img;
            if (str2 == null) {
                this.cover_img = "";
            } else {
                this.cover_img = str2;
            }
            Integer num = builder.cartoon_vip;
            if (num == null) {
                this.cartoon_vip = DEFAULT_CARTOON_VIP;
                return;
            } else {
                this.cartoon_vip = num;
                return;
            }
        }
        this.cartoon_id = builder.cartoon_id;
        this.cartoon_name = builder.cartoon_name;
        this.cover_img = builder.cover_img;
        this.cartoon_vip = builder.cartoon_vip;
    }
}
