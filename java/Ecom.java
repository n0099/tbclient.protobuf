package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class Ecom extends Message {
    public static final Integer DEFAULT_IS_SELLER = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer is_seller;

    private Ecom(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.is_seller == null) {
                this.is_seller = DEFAULT_IS_SELLER;
                return;
            } else {
                this.is_seller = builder.is_seller;
                return;
            }
        }
        this.is_seller = builder.is_seller;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<Ecom> {
        public Integer is_seller;

        public Builder() {
        }

        public Builder(Ecom ecom) {
            super(ecom);
            if (ecom != null) {
                this.is_seller = ecom.is_seller;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Ecom build(boolean z) {
            return new Ecom(this, z);
        }
    }
}
