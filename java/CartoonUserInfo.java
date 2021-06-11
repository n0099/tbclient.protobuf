package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class CartoonUserInfo extends Message {
    public static final Integer DEFAULT_IS_VIP = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer is_vip;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<CartoonUserInfo> {
        public Integer is_vip;

        public Builder() {
        }

        public Builder(CartoonUserInfo cartoonUserInfo) {
            super(cartoonUserInfo);
            if (cartoonUserInfo == null) {
                return;
            }
            this.is_vip = cartoonUserInfo.is_vip;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CartoonUserInfo build(boolean z) {
            return new CartoonUserInfo(this, z);
        }
    }

    public CartoonUserInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.is_vip;
            if (num == null) {
                this.is_vip = DEFAULT_IS_VIP;
                return;
            } else {
                this.is_vip = num;
                return;
            }
        }
        this.is_vip = builder.is_vip;
    }
}
