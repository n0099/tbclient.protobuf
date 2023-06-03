package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class CartoonChapterInfo extends Message {
    public static final Integer DEFAULT_CHAPTER_ID = 0;
    public static final Integer DEFAULT_CHAPTER_VIP = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer chapter_id;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer chapter_vip;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<CartoonChapterInfo> {
        public Integer chapter_id;
        public Integer chapter_vip;

        public Builder() {
        }

        public Builder(CartoonChapterInfo cartoonChapterInfo) {
            super(cartoonChapterInfo);
            if (cartoonChapterInfo == null) {
                return;
            }
            this.chapter_id = cartoonChapterInfo.chapter_id;
            this.chapter_vip = cartoonChapterInfo.chapter_vip;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CartoonChapterInfo build(boolean z) {
            return new CartoonChapterInfo(this, z);
        }
    }

    public CartoonChapterInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.chapter_id;
            if (num == null) {
                this.chapter_id = DEFAULT_CHAPTER_ID;
            } else {
                this.chapter_id = num;
            }
            Integer num2 = builder.chapter_vip;
            if (num2 == null) {
                this.chapter_vip = DEFAULT_CHAPTER_VIP;
                return;
            } else {
                this.chapter_vip = num2;
                return;
            }
        }
        this.chapter_id = builder.chapter_id;
        this.chapter_vip = builder.chapter_vip;
    }
}
