package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class CartoonThread extends Message {
    public static final Long DEFAULT_CARTOON_ID = 0L;
    public static final Integer DEFAULT_CHAPTER_ID = 0;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long cartoon_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer chapter_id;

    private CartoonThread(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.cartoon_id == null) {
                this.cartoon_id = DEFAULT_CARTOON_ID;
            } else {
                this.cartoon_id = builder.cartoon_id;
            }
            if (builder.chapter_id == null) {
                this.chapter_id = DEFAULT_CHAPTER_ID;
                return;
            } else {
                this.chapter_id = builder.chapter_id;
                return;
            }
        }
        this.cartoon_id = builder.cartoon_id;
        this.chapter_id = builder.chapter_id;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<CartoonThread> {
        public Long cartoon_id;
        public Integer chapter_id;

        public Builder() {
        }

        public Builder(CartoonThread cartoonThread) {
            super(cartoonThread);
            if (cartoonThread != null) {
                this.cartoon_id = cartoonThread.cartoon_id;
                this.chapter_id = cartoonThread.chapter_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CartoonThread build(boolean z) {
            return new CartoonThread(this, z);
        }
    }
}
